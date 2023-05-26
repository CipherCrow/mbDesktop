package model.entities;

import java.util.HashMap;

public class Requisito {
    private HashMap<Integer, Habilidade> habilidades;
    private Atributos atributos;
    private String feitoHeroicoNarrativo;

    public Requisito() {
    }

    public Requisito(HashMap<Integer, Habilidade> habilidades, Atributos atributos, String feitoHeroicoNarrativo) {
        this.habilidades = habilidades;
        this.atributos = atributos;
        this.feitoHeroicoNarrativo = feitoHeroicoNarrativo;
    }

    public HashMap<Integer, Habilidade> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(HashMap<Integer, Habilidade> habilidades) {
        this.habilidades = habilidades;
    }

    public Atributos getAtributos() {
        return atributos;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    public String getFeitoHeroicoNarrativo() {
        return feitoHeroicoNarrativo;
    }

    public void setFeitoHeroicoNarrativo(String feitoHeroicoNarrativo) {
        this.feitoHeroicoNarrativo = feitoHeroicoNarrativo;
    }
    
    
}
