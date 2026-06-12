package br.com.fiap.beans;

public class Missao {

    //Atributos
    private String orbita;
    private String drone;
    private String status;


    //Construtor Vazio
    public Missao() {}

    //Construtor Cheio
    public Missao(String orbita, String drone, String status) {
        this.orbita = orbita;
        this.drone = drone;
        this.status = status;
    }

    //Getters e Setters
    public String getOrbita() {return orbita;}
    public void setOrbita(String orbita) {this.orbita = orbita;}

    public String getDrone() {return drone;}
    public void setDrone(String drone) {this.drone = drone;}

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;
    }

    //ToString
    public String toString() {
        return "Missao{" +
                "\n  orbita='" + orbita + '\'' +
                "\n  drone='" + drone + '\'' +
                "\n  status='" + status + '\'' +
                "\n}";
    }

    //Metodo da Classe
    public String confirmarMissao() {
        return "Orbita: " + orbita + "\n" +
                "Drone: " + drone + "\n" +
                "Status: " + status;
    }
}
