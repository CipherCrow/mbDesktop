package model.entities;

import java.util.List;

public class Classe {
    private String nome;
    private Atributos bonusDeAtributos = new Atributos();
    private Habilidade habilidadeAutomatica;
    private List<Habilidade> habilidades;
    
    public Classe(){}
    
    public Classe(String nome){
        this.nome = nome;
    }

    public Classe(
            String nome,
            Atributos bonusDeAtributos,
            Habilidade habilidadeAutomatica,
            List<Habilidade> habilidades) {
        this.nome = nome;
        this.bonusDeAtributos = bonusDeAtributos;
        this.habilidadeAutomatica = habilidadeAutomatica;
        this.habilidades = habilidades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Atributos getBonusDeAtributos() {
        return bonusDeAtributos;
    }

    public void setBonusDeAtributos(Atributos bonusDeAtributos) {
        this.bonusDeAtributos = bonusDeAtributos;
    }

    public Habilidade getHabilidadeAutomatica() {
        return habilidadeAutomatica;
    }

    public void setHabilidadeAutomatica(Habilidade habilidadeAutomatica) {
        this.habilidadeAutomatica = habilidadeAutomatica;
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }
    
}