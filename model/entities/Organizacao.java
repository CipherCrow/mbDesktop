package model.entities;

import java.util.ArrayList;

public class Organizacao {
    private String nome;
    private String requisitoDeIngressão;
    private ArrayList<Habilidade> habilidadesExtras;

    public Organizacao(){}

    public Organizacao(String nome, String requisitoDeIngressão, ArrayList<Habilidade> habilidadesExtras) {
        this.nome = nome;
        this.requisitoDeIngressão = requisitoDeIngressão;
        this.habilidadesExtras = habilidadesExtras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRequisitoDeIngressão() {
        return requisitoDeIngressão;
    }

    public void setRequisitoDeIngressão(String requisitoDeIngressão) {
        this.requisitoDeIngressão = requisitoDeIngressão;
    }

    public ArrayList<Habilidade> getHabilidadesExtras() {
        return habilidadesExtras;
    }

    public void setHabilidadesExtras(ArrayList<Habilidade> habilidadesExtras) {
        this.habilidadesExtras = habilidadesExtras;
    }  
}