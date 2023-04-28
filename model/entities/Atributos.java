package model.entities;

public class Atributos {
    private int forca = 0,agilidade = 0,inteligencia = 0,vontade = 0;
    
    public Atributos(){}
    
    public Atributos(
            int forca,
            int agilidade,
            int inteligencia,
            int vontade){
        this.forca = forca;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
        this.vontade = vontade;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getVontade() {
        return vontade;
    }

    public void setVontade(int vontade) {
        this.vontade = vontade;
    }
    
    
}
