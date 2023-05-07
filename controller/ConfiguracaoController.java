package controller;

import java.util.ArrayList;
import javax.swing.JTable;
import model.entities.Configuracao;
import model.entities.MaterialItem;

public class ConfiguracaoController {
 
    public void carregarMateriais(String[] colunas, JTable tabela) throws Exception{
        ArrayList<MaterialItem> materiaisCadastrados = Configuracao.coletarMateriais();
        
        if(materiaisCadastrados == null){
            throw new Exception("Não existe material cadastrado!");
        }
        
        tabela.setModel(
        new javax.swing.table.DefaultTableModel( 
            new Object [] [] { materiaisCadastrados.toArray() }
            ,colunas ));
         
    }    
}