package beans;

public class Material {

    //Atributos
    private String tipo;
    private boolean reciclavel;
    private double valorPorKg;


    //Construtor Vazio
    public Material() {
    }

    //Construtor Cheio
    public Material(String tipo, boolean reciclavel, double valorPorKg) {
        this.tipo = tipo;
        this.reciclavel = reciclavel;
        this.valorPorKg = valorPorKg;
    }

    //Getters e Setters

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}

    public boolean isReciclavel() {return reciclavel;}
    public void setReciclavel(boolean reciclavel) {this.reciclavel = reciclavel;}

    public double getValorPorKg() {return valorPorKg;}
    public void setValorPorKg(double valorPorKg) {this.valorPorKg = valorPorKg;}



    //ToString
    public String toString(){
        return "Material{" +
                "tipo=" + tipo +
                ", reciclavel=" + reciclavel +
                ", valorPorKg=" + valorPorKg + "R$" +
                '}';
    }

    //Metodos da Classe

    //Calcula o valor do Material
    public double calcularValorTotal(double peso) {
        return peso * valorPorKg;
    }


}
