package controller;

import view.gui.ArquivoMaterial;
import view.gui.CadastroMaterial;

public class GerenciadorDeTelas{
    
    //Vai Crescer infinitamente, precisarei lidar com isso de alguma forma esperta
    private static ArquivoMaterial arqMaterial;
    private static CadastroMaterial cadMaterial;
    
    public static ArquivoMaterial getArqMaterial() {
        if(arqMaterial == null){
            arqMaterial = new ArquivoMaterial();
        }
        return arqMaterial ;
    }

    public static CadastroMaterial getCadMaterial() {
        if(cadMaterial == null){
            cadMaterial = new CadastroMaterial();
        }
        return cadMaterial ;
    }
    
}