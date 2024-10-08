package main;

import com.google.gson.Gson;
import main.models.CepInfo;
import main.utils.CepValidator;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Properties;
import java.util.Scanner;

import static utils.EnvLoader.loadEnv;


public class mainCepSearch {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, insira um CEP: ");

        String inputCep = scanner.nextLine();

        if (!CepValidator.isValidCep(inputCep)) {
            System.out.println("O CEP inserido é inválido: " + inputCep);
            return;
        }



        Properties env = loadEnv();
        String token = env.getProperty("TOKEN");


        try {

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://www.cepaberto.com/api/v3/cep?cep=" + inputCep))
                    .header("Authorization", "Token " +  token)
                    .build();
            System.out.println("try");

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


            int statusCode = response.statusCode();
            if (statusCode > 300) {
                System.out.println("Error: " + statusCode);
                System.out.println("Error message: " + response.body());
            } else {
                Gson gson = new Gson();

                String json = response.body();
                CepInfo cep = gson.fromJson(json, CepInfo.class);

                System.out.println(cep.getCidade().getNome() + "-" + cep.getEstado().getSigla());
            }



        } catch (IOException | InterruptedException e) {
            System.out.println("catch");

            e.printStackTrace();
        }
    }
}

