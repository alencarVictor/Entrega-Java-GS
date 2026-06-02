package beans;

public class Nave {

    //Atributos
    private String nome;
    private double capacidadeMaxima;
    private double cargaAtual;
    private String modelo;

    //Construtor vazio
    public Nave() {
    }

    //Construtor Cheio
    public Nave(String nome, double capacidadeMaxima, double cargaAtual, String modelo) {
        this.nome = nome;
        this.capacidadeMaxima = capacidadeMaxima;
        this.cargaAtual = cargaAtual;
        this.modelo = modelo;
    }

    //Getters e Setters
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public double getCapacidadeMaxima() {return capacidadeMaxima;}
    public void setCapacidadeMaxima(double capacidadeMaxima) {this.capacidadeMaxima = capacidadeMaxima;}

    public double getCargaAtual() {return cargaAtual;}
    public void setCargaAtual(double cargaAtual) {this.cargaAtual = cargaAtual;}

    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}

    //ToString
    public String toString(){

            return "Nave{" +
                    "nome=" + nome +
                    ", capacidadeMaxima=" + capacidadeMaxima + "kg" +
                    ", cargaAtual=" + cargaAtual + "kg" +
                    ", modelo='" + modelo + '\'' +
                    '}';
        }
}
