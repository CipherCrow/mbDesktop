package model.entities;

import java.util.HashMap;

public class Requisito {
    private HashMap<Integer, Habilidade> habilidades;
    private Atributos atributos;
    private String feitoHeroicoNarrativo;
    private Integer nivel;

    public Requisito() {
    }

    public Requisito(HashMap<Integer, Habilidade> habilidades, Atributos atributos, String feitoHeroicoNarrativo, int nivel) {
        this.habilidades = habilidades;
        this.atributos = atributos;
        this.feitoHeroicoNarrativo = feitoHeroicoNarrativo;
        this.nivel = nivel;
    }
    
    public String getDescricaoView() {
        StringBuilder descricaoView = new StringBuilder("Nenhum Requisito");

        if (habilidades != null || atributos != null || feitoHeroicoNarrativo != null || nivel != null) {
            descricaoView = new StringBuilder();

            if (nivel != null) {
                descricaoView.append("'Nivel: ").append(this.nivel).append("' ");
            }
            if (feitoHeroicoNarrativo != null) {
                descricaoView.append("'Feito: ").append(this.feitoHeroicoNarrativo).append("' ");
            }
            if (atributos != null) {
                descricaoView.append("'Atributos: ").append(this.atributos).append("' ");
            }
            if (habilidades != null) {
                descricaoView.append("'Habilidades: ").append(this.habilidades).append("' ");
            }
        }

        return descricaoView.toString();
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
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
