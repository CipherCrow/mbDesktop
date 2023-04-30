package model.entities;

public class Personagem {
    //Básico
    private String nome;
    private Raca raca;
    private Classe classe;
    private int experiencia = 0;
    private int nivel = 1;
    private String motivacao;
    
    //Contabilizadores de vida
    private Vitalidade vitalidade = new vitalidade();
    
    //Atributos
    private Atributos atributos = new Atributos();
    
    //Dependentes de itens e atributos
    private Carga limiteDeCarga = new Carga();
    private Movimentacao limiteDeMovimentacao = new Movimentacao();
    private Defesa defesas = new Defesa();
    
    //Inventário e Itens
    private Inventario inventario = new Inventario();
}
