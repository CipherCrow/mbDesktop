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
        String chave = parametros[0];
        
        if (!mapaCadastroMaterial.containsKey(chave)) {
            if( parametros.length == 1){
                mapaCadastroMaterial.put(chave, new MaterialCadastro());
            }else{
                System.out.println(parametros[1]);
                MaterialCadastro cadastro = new MaterialCadastro( Integer.valueOf( parametros[1] ));
                mapaCadastroMaterial.put(chave, cadastro);
            }
        }
        
        return mapaCadastroMaterial.get(chave);
    }
    
    public static void removerCadMaterial(String... parametros) {
        String chave = parametros[0];
        mapaCadastroMaterial.remove( chave );
    }
    
}