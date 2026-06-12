package br.com.fiap.beans;

public class Titanio extends Material {

    //Atributos
    private String origem;

    //Construtor Vazio
    public Titanio() {
        super("Titanio", 85.00, true);
    }

    //Construtor Cheio
    public Titanio(String origem) {
        super("Titanio", 85.00, true);
        this.origem = origem;
    }

    //Getters e Setters
    public String getOrigem() {return origem;}
    public void setOrigem(String origem) {
        this.origem = origem;
    }

    //ToString
    public String toString() {
        return "Titanio{" +
                "nome='" + getNome() + '\'' +
                ", precoKg=" + getPrecoKg() +
                ", reciclavel=" + isReciclavel() +
                ", origem=" + origem +
                '}';
    }
}
