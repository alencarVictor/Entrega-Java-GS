package bean;

public class Coleta {

    //Atributos
    private Nave nave;
    private Detrito detrito;
    private String dataColeta;
    private String localizacaOrbital;

    //Contrutor Vazio
    public Coleta() {
    }

    //Construtor Cheio
    public Coleta(Nave nave, Detrito detrito, String dataColeta, String localizacaOrbital) {
        this.nave = nave;
        this.detrito = detrito;
        this.dataColeta = dataColeta;
        this.localizacaOrbital = localizacaOrbital;
    }
    //Getters e Setters
    public Nave getNave() {return nave;}
    public void setNave(Nave nave) {this.nave = nave;}

    public Detrito getDetrito() {return detrito;}
    public void setDetrito(Detrito detrito) {this.detrito = detrito;}

    public String getDataColeta() {return dataColeta;}
    public void setDataColeta(String dataColeta) {this.dataColeta = dataColeta;}

    public String getLocalizacaOrbital() {return localizacaOrbital;}
    public void setLocalizacaOrbital(String localizacaOrbital) {
        this.localizacaOrbital = localizacaOrbital;}

}
