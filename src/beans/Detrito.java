package beans;

public class Detrito {

    //Atributos
    private String codigo;
    private double peso;
    private double tamanho;
    private String origem;
    private Material material;

    //Constutor vazio
    public Detrito() {
    }

    //Construtor Cheio
    public Detrito(String codigo, double peso, double tamanho, String origem, Material material) {
        this.codigo = codigo;
        this.peso = peso;
        this.tamanho = tamanho;
        this.origem = origem;
        this.material = material;
    }

    //Getters e Setters

    public String getCodigo() {return codigo;}
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPeso() {return peso;}
    public void setPeso(double peso) {this.peso = peso;}

    public double getTamanho() {return tamanho;}
    public void setTamanho(double tamanho) {this.tamanho = tamanho;}

    public String getOrigem() {return origem;}
    public void setOrigem(String origem) {this.origem = origem;}

    public Material getMaterial() {return material;}
    public void setMaterial(Material material) {
        this.material = material;
    }

    //ToString
    public String toString(){
        return "Detrito{" +
                "codigo=" + codigo +
                ", peso=" + peso + "kg" +
                ", tamanho=" + tamanho + "m" +
                ", origem='" + origem + '\'' +
                ", material='" + material.getNome() + '\'' +
                '}';
    }

    //Metodos da Classe

    //Classifica tamanho do detrito
    public String classificarTamanho() {
        if (tamanho < 0.1) return "Pequeno";
        else if (tamanho < 1.0) return "Médio";
        else return "Grande";
    }
}
