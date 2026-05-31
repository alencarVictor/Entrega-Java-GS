package bean;

public class Coleta {

    //Atributos
    private Nave nave;
    private Detrito detrito;
    private String dataColeta;
    private String localizacaoOrbital;

    //Contrutor Vazio
    public Coleta() {
    }

    //Construtor Cheio
    public Coleta(Nave nave, Detrito detrito, String dataColeta, String localizacaoOrbital) {
        this.nave = nave;
        this.detrito = detrito;
        this.dataColeta = dataColeta;
        this.localizacaoOrbital = localizacaoOrbital;
    }
    //Getters e Setters
    public Nave getNave() {return nave;}
    public void setNave(Nave nave) {this.nave = nave;}

    public Detrito getDetrito() {return detrito;}
    public void setDetrito(Detrito detrito) {this.detrito = detrito;}

    public String getDataColeta() {return dataColeta;}
    public void setDataColeta(String dataColeta) {this.dataColeta = dataColeta;}

    public String getLocalizacaoOrbital() {return localizacaoOrbital;}
    public void setLocalizacaoOrbital(String localizacaOrbital) {
        this.localizacaoOrbital = localizacaOrbital;}

    //ToString
    public String toString(){
        return "Coleta{" +
                "nave=" + nave.getNome() +
                ", detrito=" + detrito.getCodigo() +
                ", dataColeta='" + dataColeta + '\'' +
                ", localizacaoOrbital='" + localizacaoOrbital + '\'' +
                '}';
    }

}
