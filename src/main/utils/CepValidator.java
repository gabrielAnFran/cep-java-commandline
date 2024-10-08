package main.utils;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CepValidator {

    private static final String CEP_REGEX = "^[0-9]{5}-?[0-9]{3}$";
    private static final Pattern CEP_PATTERN = Pattern.compile(CEP_REGEX);


    public static boolean isValidCep(String cep) {
        if (cep == null || cep.equals("00000000")) {
            return false;
        }

        Matcher matcher = CEP_PATTERN.matcher(cep);
        return matcher.matches();
    }
}
