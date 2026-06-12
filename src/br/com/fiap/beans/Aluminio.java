package br.com.fiap.beans;

public class Aluminio extends Material {

    //Atributos
    private double pureza;

    //Construtor Vazio
    public Aluminio() {
        super("Aluminio", 12.00, true);
    }

    //Construtor Cheio
    public Aluminio(double pureza) {
        super("Aluminio", 12.00, true);
        this.pureza = pureza;
    }

    //Getters e Setters
    public double getPureza() {return pureza;}
    public void setPureza(double pureza) {
        this.pureza = pureza;
    }

    //ToString
    public String toString() {
        return "Aluminio{" +
                "nome='" + getNome() + '\'' +
                ", precoKg=" + getPrecoKg() +
                ", reciclavel=" + isReciclavel() +
                ", pureza=" + pureza +
                '}';
    }
}