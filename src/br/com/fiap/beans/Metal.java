package br.com.fiap.beans;

public class Metal extends Material{

    //Atributos
    private String tipoLiga;

    //Construtor Vazio
    public Metal() {
        super ("Metal",18.00,true);
    }

    //Construtor Cheio
    public Metal(String tipoLiga) {
        super ("Metal",18.00,true);
        this.tipoLiga = tipoLiga;
    }

    //Getters e Setters
    public String getTipoLiga() {return tipoLiga;}
    public void setTipoLiga(String tipoLiga) {
        this.tipoLiga = tipoLiga;
    }

    //ToString
    public String toString() {
        return "Metal{" +
                "nome='" + getNome() + '\'' +
                ", precoKg=" + getPrecoKg() +
                ", reciclavel=" + isReciclavel() +
                ", tipoLiga=" + tipoLiga +
                '}';
    }
}
