package br.com.fiap.beans;

public class Material {

    //Atributos
    private String nome;
    private double precoKg;
    private boolean reciclavel;


    //Construtor vazio
    public Material() {}

    //Construtor Cheio
    public Material(String nome, double precoKg, boolean reciclavel) {
        this.nome = nome;
        this.precoKg = precoKg;
        this.reciclavel = reciclavel;
    }

    //Getters e Setters
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public double getPrecoKg() {return precoKg;}
    public void setPrecoKg(double precoKg) {this.precoKg = precoKg;}

    public boolean isReciclavel() {return reciclavel;}
    public void setReciclavel(boolean reciclavel) {
        this.reciclavel = reciclavel;
    }

    //ToString
    public String toString() {
        return "Material{" +
                "nome='" + nome + '\'' +
                ", precoKg=" + precoKg +
                ", reciclavel=" + reciclavel +
                '}';
    }

    //Metodo da Classe
    public double calcularValorLote(double quantidade) {
        return precoKg * quantidade;
    }
}
