package main.models;

public class CepInfo {
    private double altitude;
    private String cep;
    private String latitude;
    private String longitude;
    private City cidade;
    private State estado;

    // Getters and Setters
    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public City getCidade() {
        return cidade;
    }

    public void setCidade(City city) {
        this.cidade = city;
    }

    public State getEstado() {
        return estado;
    }

    public void setEstado(State state) {
        this.estado = state;
    }

    @Override
    public String toString() {
        return "CepInfo{" +
                "altitude=" + altitude +
                ", cep='" + cep + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", cidade=" + cidade +
                ", estado=" + estado +
                '}';
    }
}

