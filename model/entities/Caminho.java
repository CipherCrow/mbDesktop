package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Caminho {
    private String nome;
    private String requisito;
    private ArrayList<Raca> racasComuns;
    private Habilidade habilidadeAutomatica;
    private List<Habilidade> habilidadesExtras;

    public Caminho(){}

    public String getNome() {
        return nome;
    }

    public Caminho(
            String nome,
            String requisito,
            ArrayList<Raca> racasComuns,
            Habilidade habilidadeAutomatica,
            List<Habilidade> habilidadesExtras) {
        this.nome = nome;
        this.requisito = requisito;
        this.racasComuns = racasComuns;
        this.habilidadeAutomatica = habilidadeAutomatica;
        this.habilidadesExtras = habilidadesExtras;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRequisito() {
        return requisito;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    public ArrayList<Raca> getRacasComuns() {
        return racasComuns;
    }

    public void setRacasComuns(ArrayList<Raca> racasComuns) {
        this.racasComuns = racasComuns;
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
