package controller;

import java.util.ArrayList;
import model.entities.Configuracao;
import model.entities.MaterialItem;

public class ConfiguracaoController {
 
    public static MaterialItem[] carregarMateriais() throws Exception{
        ArrayList<MaterialItem> materiaisCadastrados = Configuracao.coletarMateriais();;
        
        if(materiaisCadastrados == null){
            throw new Exception("Não existe material cadastrado!");
        }
        return (MaterialItem[]) materiaisCadastrados.toArray();
        
    }
}