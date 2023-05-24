package model.entities;

public class Idioma {

    private int id;
    private String nome;
    private String idiomaDeReferencia;

    public Idioma(){}

    public Idioma(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    public Idioma(int id, String nome, String idiomaDeReferencia) {
        this.id = id;
        this.nome = nome;
        this.idiomaDeReferencia = idiomaDeReferencia;
    }
    
    public String getDescricaoView(){
        String descricao = null;
        
        if(idiomaDeReferencia == null || idiomaDeReferencia.isBlank()){
            descricao = 
                "O Idioma " + this.nome.toUpperCase() + " é uma língua fascinante, com estrutura gramatical complexa e pronúncia melódica."
            + " Sua escrita é visualmente impressionante, com caracteres elegantes e distintos. Dominar o Idioma X abre portas para descobrir segredos antigos"
            + " e explorar uma cultura vibrante.";
            return descricao;
        }
        
        descricao = 
            "O " + this.nome.toUpperCase() + " é um idioma que compartilha semelhanças notáveis com o  real " + this.idiomaDeReferencia.toUpperCase() + "."
        + " Com estruturas gramaticais e vocabulário similares, os falantes do " + this.nome.toUpperCase() + " podem esperar uma certa familiaridade ao explorar essa nova língua."
        + " Desde a entonação até os padrões de frase, o " + this.nome.toUpperCase() + " evoca a essência e a cadência do idioma " + this.idiomaDeReferencia.toUpperCase() + ","
        + " permitindo que os personagens fluam naturalmente na comunicação. Embora apresente algumas variações próprias, os falantes fluentes do " + this.nome.toUpperCase() 
        + " serão capazes de se expressar com confiança.";
        return descricao;
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
