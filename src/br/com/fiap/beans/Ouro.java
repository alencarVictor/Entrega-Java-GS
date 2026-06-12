package br.com.fiap.beans;

public class Ouro extends Material{

    //Atributos
    private int quilates;

    //Costrutor Vazio
    public Ouro() {
    super ("Ouro",950.00,false);
    }

    //Construtor Cheio
    public Ouro(int quilates) {
        super ("Ouro",950.00,false);
        this.quilates = quilates;
    }

    //Getters e Setters
    public int getQuilates() {return quilates;}
    public void setQuilates(int quilates) {
        this.quilates = quilates;
    }

    //ToString
    public String toString() {
        return "Ouro{" +
                "nome='" + getNome() + '\'' +
                ", precoKg=" + getPrecoKg() +
                ", reciclavel=" + isReciclavel() +
                ", quilates=" + quilates +
                '}';
    }
}
