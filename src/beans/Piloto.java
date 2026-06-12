package beans;

public class Piloto extends Tripulante {

    //Atributos
    private double horasDeVoo;
    private String licenca;

    //Constutor Vazio
    public Piloto() {}


    //Construtor Cheio
    public Piloto(String nome, String especialidade, int matricula, double horasDeVoo, String licenca) {
        super(nome, especialidade, matricula);
        this.horasDeVoo = horasDeVoo;
        this.licenca = licenca;
    }

    //Getters e Setters
    public double getHorasDeVoo() {return horasDeVoo;}
    public void setHorasDeVoo(double horasDeVoo) {this.horasDeVoo = horasDeVoo;}

    public String getLicenca() {return licenca;}
    public void setLicenca(String licenca) {this.licenca = licenca;}

    //ToString
    public String toString(){
        return super.toString() +
                ", horasDeVoo=" + horasDeVoo +
                ", licenca='" + licenca + '\'';
    }

    //Metodos da Classe
    public void registrarHorasVoo(double horas) {
        this.horasDeVoo += horas;
    }
}
