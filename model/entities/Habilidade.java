package model.entities;

import model.enums.HabilidadeCategoriaEnum;
import model.enums.HabilidadeTipoEnum;

public class Habilidade {
    private String nome;
    private String categoria = HabilidadeCategoriaEnum.Caracteristica.getCategoria();
    private String tipo = HabilidadeTipoEnum.Acao.getTipo();
    private String runa;
    private String requisito;
    private int    mana;
    private int    dificuldade;
    private String descricao;
    private String resumo;

    public Habilidade(){}
    
    public Habilidade(
            String nome,
            String categoria,
            String tipo,
            String runa,
            String requisito,
            int mana,
            int dificuldade,
            String descricao,
            String resumo
            ){
        this.nome = nome;
        this.categoria = categoria;
        this.tipo = tipo;
        this.runa = runa;
        this.requisito =  requisito;
        this.mana = mana;
        this.dificuldade = dificuldade;
        this.descricao = descricao;
        this.resumo = resumo;
    }

    public String getRuna() {
        return runa;
    }

    public void setRuna(String runa) {
        this.runa = runa;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRequisito() {
        return requisito;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }   
}
