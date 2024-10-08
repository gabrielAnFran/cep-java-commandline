package main.models;

public class State {
    private String sigla; // Represents the state abbreviation

    // Constructor
    public State() {
    }

    // Getters and Setters
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    // Override toString for better output readability
    @Override
    public String toString() {
        return "Estado{" +
                "sigla='" + sigla + '\'' +
                '}';
    }
}
