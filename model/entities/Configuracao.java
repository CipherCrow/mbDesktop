package model.entities;

import java.util.ArrayList;

public class Configuracao {

    private static final ArrayList<Conteudo> conteudos = new ArrayList<>();
      
    public static void mudarEstadoConteudo(String nome) {
        Configuracao.conteudos.forEach(conteudo -> {
            if (conteudo.getNome().equals(nome)) {
                conteudo.mudaStatus();
            }
        });
    }

    public static Conteudo encontrarConteudo(String nome) {
        Conteudo encontrado = null;

        //Problema futuro se continuar usando ArrayList
        for (int temp = 0; temp < Configuracao.conteudos.size(); temp++) {
            Conteudo atual = Configuracao.conteudos.get(temp);
            if (atual.getNome().equals(nome)) {
                encontrado = atual;
                break;
            }
        }

        /* local variables referenced from a lambda expression must be final or effectively final
       Configuracao.conteudos.forEach( conteudo -> {
           if(conteudo.getNome().equals( nome )){
               encontrado. = conteudo;
           }
       });
         */
        return encontrado;
    }        
            
    public static void addConteudo(Conteudo conteudo) {
        Configuracao.conteudos.add(conteudo);                           
    }
    
    public static ArrayList<Material> coletarMateriais(){
        if(Configuracao.conteudos.isEmpty()){
           return null; 
        }
        
        ArrayList<Material> materiaisCadastrados = new ArrayList<>();
        
        //Problema futuro se continuar usando ArrayList
        for (int temp = 0; temp < Configuracao.conteudos.size(); temp++) {
            Conteudo atual = Configuracao.conteudos.get(temp);
            
            //Caso a lista não esteja vazia, adiciona todos os materiais na lista dos materiaisCadastrados
            if (!atual.getMateriaisItens().isEmpty()) {
                materiaisCadastrados.addAll( atual.getMateriaisItens() );
            }
        }
        
        return materiaisCadastrados; 
    }
    
}