package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Raca {
    private String Nome;
    private Atributos atributos = new Atributos();
    private List<Classe> classesComuns = new ArrayList<Classe>();
    private Habilidade habilidadeAutomatica;
    private List<Habilidade> habilidadesExtras;
    
    public Raca(){}
  
    public Raca(String nome){
        this.Nome = nome;
    }
    public Raca(
            String Nome,
            Habilidade habilidadeAutomatica,
            List<Habilidade> habilidadesExtras) {
        this.Nome = Nome;
        this.habilidadeAutomatica = habilidadeAutomatica;
        this.habilidadesExtras = habilidadesExtras;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    public Atributos getAtributos(){
        return this.atributos;
    }
    
    public void getClassesComuns(){
        //em breve
    }
    public void addClasseComum(Classe classe){
        this.classesComuns.add(classe);
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