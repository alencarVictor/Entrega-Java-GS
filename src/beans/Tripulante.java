package beans;

public class Tripulante {

    //Atributos
    private String nome;
    private String especialidade;
    private int matricula;

    //Construtor vazio
    public Tripulante() {}

    //Construtor Cheio
    public Tripulante(String nome, String especialidade, int matricula) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.matricula = matricula;
    }

    //Getters e Setters
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getEspecialidade() {return especialidade;}
    public void setEspecialidade(String especialidade) {this.especialidade = especialidade;}

    public int getMatricula() {return matricula;}
    public void setMatricula(int matricula) {this.matricula = matricula;}

    //ToString
    public String toString(){
        return "Tripulante{" +
                "nome=" + nome +
                ", especialidade=" + especialidade +
                ", matricula=" + matricula +
                '}';
    }
}
