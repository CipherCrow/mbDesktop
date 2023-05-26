package model.entities;

import model.enums.HabilidadeCategoriaEnum;
import model.enums.HabilidadeTipoEnum;

public class Habilidade {
    private int id;
    private String nome;
    private String categoria = HabilidadeCategoriaEnum.Caracteristica.getCategoria();
    private String tipo = HabilidadeTipoEnum.Acao.getTipo();
    private String runa;
    private Requisito requisito;
    private int    mana;
    private int    dificuldade;
    private String descricao;
    private String resumo;

    public Habilidade(){}
    
    public Habilidade(
            int id,
            String nome,
            String categoria,
            String tipo,
            String runa,
            Requisito requisito,
            int mana,
            int dificuldade,
            String descricao,
            String resumo
            ){
        this.id = id;
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
    
    public String getDescricaoView() {
        StringBuilder descricaoView = new StringBuilder();

        if (runa == null) {
            descricaoView.append("Para se usar a Habilidade é necessário que o personagem seja capaz de utilizar magias que carreguem uma ").append(this.runa);
        }

        descricaoView.append("\n")
                    .append(this.nome)
                    .append("\n")
                    .append(this.categoria)
                    .append(" - ")
                    .append(this.tipo)
                    .append("\nRequisito(s): ")
                    .append(this.requisito.getDescricaoView())
                    .append("\nMana: ")
                    .append(this.mana)
                    .append("\nDescrição: ")
                    .append(this.descricao);

        return descricaoView.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Requisito getRequisito() {
        return requisito;
    }

    public void setRequisito(Requisito requisito) {
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
