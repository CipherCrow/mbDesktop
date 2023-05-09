package model.entities;

import java.util.ArrayList;

class Idioma {

    private String nome;
    private String[] falantesComuns = {};
    private String idiomaDeReferencia;

    public Idioma(){}

    public Idioma(String nome, String idiomaDeReferencia) {
        this.nome = nome;
        this.idiomaDeReferencia = idiomaDeReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getFalantesComuns() {
        return falantesComuns;
    }

    public void setFalantesComuns(String[] falantesComuns) {
        this.falantesComuns = falantesComuns;
    }

    public String getIdiomaDeReferencia() {
        return idiomaDeReferencia;
    }

    public void setIdiomaDeReferencia(String idiomaDeReferencia) {
        this.idiomaDeReferencia = idiomaDeReferencia;
    }

}
