package model.entities;

class Idioma {

    private int id;
    private String nome;
    private String idiomaDeReferencia;
    private String descricao;

    public Idioma(){}

    public Idioma(int id, String nome, String idiomaDeReferencia, String descricao) {
        this.id = id;
        this.nome = nome;
        this.idiomaDeReferencia = idiomaDeReferencia;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdiomaDeReferencia() {
        return idiomaDeReferencia;
    }

    public void setIdiomaDeReferencia(String idiomaDeReferencia) {
        this.idiomaDeReferencia = idiomaDeReferencia;
    }

}
