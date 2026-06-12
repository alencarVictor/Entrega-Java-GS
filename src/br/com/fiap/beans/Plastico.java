package br.com.fiap.beans;

public class Plastico extends Material {

    //Atributos
    private String tipo;

    //Contrutor Vazio
    public Plastico() {
        super ("Plastico",4.50,true);
    }

    //Construtor Cheio
    public Plastico(String tipo) {
        super ("Plastico",4.50,true);
        this.tipo = tipo;
    }

    //Getters e Setters
    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //ToString
    public String toString() {
        return "Plastico{" +
                "nome='" + getNome() + '\'' +
                ", precoKg=" + getPrecoKg() +
                ", reciclavel=" + isReciclavel() +
                ", tipo=" + tipo +
                '}';
    }
}
