package model.entities;

import java.util.ArrayList;

public class Configuracao {

    private static final ArrayList<Conteudo> conteudos = new ArrayList<>();
    
    public static void mudarEstadoMaterial(String nome) {
        Configuracao.conteudos.forEach(conteudo -> {
            if (conteudo.getNome().equals(nome)) {
                conteudo.mudaStatus();
            }
        });
    }

    public static Conteudo encontrarMaterial(String nome) {
        Conteudo encontrado = null;

        //Problema futuro se continuar usando ArrayList
        for (int temp = 0; temp < Configuracao.conteudos.size(); temp++) {
            Conteudo atual = Configuracao.conteudos.get(temp);
            if (atual.equals(nome)) {
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
    
}