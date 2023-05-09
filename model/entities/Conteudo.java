package model.entities;

import model.enums.ConteudoStatusEnum;
import java.util.ArrayList;

public class Conteudo {

    private String nome;
    private ConteudoStatusEnum status = ConteudoStatusEnum.Ativado;
    private ArrayList<Caminho> caminhos = new ArrayList<>();
    private ArrayList<Raca> racas = new ArrayList<>();
    private ArrayList<Classe> classes  = new ArrayList<>();
    private ArrayList<Habilidade> habilidade  = new ArrayList<>();
    private ArrayList<Item> items  = new ArrayList<>();
    private ArrayList<Organizacao> organizacoes  = new ArrayList<>();
    private ArrayList<MaterialItem> materiaisItens  = new ArrayList<>();
    private ArrayList<Antecedente> antecedente  = new ArrayList<>();
    private ArrayList<Idioma> idiomas  = new ArrayList<>(); 
    private ArrayList<Habilidade> habilidadesExtras  = new ArrayList<>();

    public Conteudo(){}

    public Conteudo(
            String nome,
            ArrayList<Caminho> caminhos,
            ArrayList<Raca> racas,
            ArrayList<Classe> classes,
            ArrayList<Habilidade> habilidade,
            ArrayList<Item> items,
            ArrayList<Organizacao> organizacoes,
            ArrayList<MaterialItem> materiaisItens,
            ArrayList<Antecedente> antecedente,
            ArrayList<Idioma> idiomas,
            ArrayList<Habilidade> habilidadesExtras) {
        this.nome = nome;
        this.caminhos = caminhos;
        this.racas = racas;
        this.classes = classes;
        this.habilidade = habilidade;
        this.items = items;
        this.organizacoes = organizacoes;
        this.materiaisItens = materiaisItens;
        this.antecedente = antecedente;
        this.idiomas = idiomas;
        this.habilidadesExtras = habilidadesExtras;
    }

    public ArrayList<Habilidade> getHabilidadesExtras() {
        return habilidadesExtras;
    }

    public void setHabilidadesExtras(ArrayList<Habilidade> habilidadesExtras) {
        this.habilidadesExtras = habilidadesExtras;
    }
    
    public ArrayList<Idioma> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<Idioma> idiomas) {
        this.idiomas = idiomas;
    } 

    public ArrayList<Raca> getRacas() {
        return racas;
    }

    public void setRacas(ArrayList<Raca> racas) {
        this.racas = racas;
    }

    public ArrayList<Organizacao> getOrganizacoes() {
        return organizacoes;
    }

    public void setOrganizacoes(ArrayList<Organizacao> organizacoes) {
        this.organizacoes = organizacoes;
    }

    public ArrayList<MaterialItem> getMateriaisItens() {
        return materiaisItens;
    }

    public void setMateriaisItens(ArrayList<MaterialItem> materiaisItens) {
        this.materiaisItens = materiaisItens;
    }

    public ArrayList<Antecedente> getAntecedente() {
        return antecedente;
    }

    public void setAntecedente(ArrayList<Antecedente> antecedente) {
        this.antecedente = antecedente;
    }

    public ConteudoStatusEnum getStatus() {
        return status;
    }

    public void mudaStatus() {
        if (this.status.equals(ConteudoStatusEnum.Ativado)) {
            this.status = ConteudoStatusEnum.Desativado;
        } else {
            this.status = ConteudoStatusEnum.Ativado;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Caminho> getCaminhos() {
        return caminhos;
    }

    public void setCaminhos(ArrayList<Caminho> caminhos) {
        this.caminhos = caminhos;
    }

    public ArrayList<Classe> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Classe> classes) {
        this.classes = classes;
    }

    public ArrayList<Habilidade> getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(ArrayList<Habilidade> habilidade) {
        this.habilidade = habilidade;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}