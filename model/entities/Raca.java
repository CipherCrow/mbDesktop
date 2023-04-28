package model.entities;

import java.util.List;

public class Raca {
    private String Nome;
    private int[] atributos = {0,0,0,0};
    private Habilidade habilidadeAutomatica;
    private List<Habilidade> habilidadesExtras;
    
    public Raca(){}
  
    public Raca(
            String Nome,
            int[] atributos,
            Habilidade habilidadeAutomatica,
            List<Habilidade> habilidadesExtras) {
        this.Nome = Nome;
        this.atributos = atributos;
        this.habilidadeAutomatica = habilidadeAutomatica;
        this.habilidadesExtras = habilidadesExtras;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    public int getForca(){
        return this.atributos[0];
    }
    
    public void setForca(int forca){
        this.atributos[0] = forca;
    }
    
    public int getAgilidade(){
        return this.atributos[1];
    }
    
    public void setAgilidade(int agilidade){
        this.atributos[1] = agilidade;
    }
    
    public int getInteligencia(){
        return this.atributos[2];
    }
    
    public void setInteligencia(int inteligencia){
        this.atributos[2] = inteligencia;
    }
    
    public int getVontade(){
        return this.atributos[3];
    }
    
    public void setVontade(int vontade){
        this.atributos[3] = vontade;
    }

    public Habilidade getHabilidadeAutomatica() {
        return habilidadeAutomatica;
    }

    public void setHabilidadeAutomatica(Habilidade habilidadeAutomatica) {
        this.habilidadeAutomatica = habilidadeAutomatica;
    }

    public List<Habilidade> getHabilidadesExtras() {
        return habilidadesExtras;
    }

    public void setHabilidadesExtras(List<Habilidade> habilidadesExtras) {
        this.habilidadesExtras = habilidadesExtras;
    }
    
    
    
}