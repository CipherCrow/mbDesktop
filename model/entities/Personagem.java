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
    private int pontosDeVida = 60;
    private int pontosDeMana = 60;
    
    //Atributos
    private Atributos atributos = new Atributos();
    
    //Dependentes de itens e atributos
    private Carga limiteDeCarga = new Carga();
    private Movimentacao limiteDeMovimentacao = new Movimentacao();
    private Defesa defesas = new Defesa();
    
    //Inventário e Itens
}
