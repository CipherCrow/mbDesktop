package controller;

import java.util.HashMap;
import java.util.Map;
import view.gui.MaterialArquivo;
import view.gui.MaterialCadastro;

public class GerenciadorDeTelas{
    
    //Vai Crescer infinitamente, precisarei lidar com isso de alguma forma esperta
    private static MaterialArquivo arqMaterial;
    private static Map<String, MaterialCadastro> mapaCadastroMaterial = new HashMap<>();
    
    public static MaterialArquivo getArqMaterial() {
        if(arqMaterial == null){
            arqMaterial = new MaterialArquivo();
        }
        return arqMaterial ;
    }

    public static MaterialCadastro getCadMaterial(String... parametros) {
        String chave = (String) parametros[0];
        
        if (!mapaCadastroMaterial.containsKey(chave)) {
            mapaCadastroMaterial.put(chave, new MaterialCadastro(Integer.parseInt( parametros[1] ) ));
        }

        return mapaCadastroMaterial.get(chave);
    }

}