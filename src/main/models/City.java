package main.models;

public class City {
    private int ddd;           // Represents the DDD (area code)
    private String ibge;      // Represents the IBGE code
    private String nome;      // Represents the name of the city

    // Constructor
    public City() {
    }

    // Getters and Setters
    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Override toString for better output readability
    @Override
    public String toString() {
        return "Cidade{" +
                "ddd=" + ddd +
                ", ibge='" + ibge + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
