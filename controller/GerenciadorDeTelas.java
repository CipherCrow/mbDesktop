package controller;

import view.gui.MaterialArquivo;
import view.gui.MaterialCadastro;

public class GerenciadorDeTelas{
    
    //Vai Crescer infinitamente, precisarei lidar com isso de alguma forma esperta
    private static MaterialArquivo arqMaterial;
    private static MaterialCadastro cadMaterial;
    
    public static MaterialArquivo getArqMaterial() {
        if(arqMaterial == null){
            arqMaterial = new MaterialArquivo();
        }
        return arqMaterial ;
    }

    public static MaterialCadastro getCadMaterial() {
        if(cadMaterial == null){
            cadMaterial = new MaterialCadastro();
        }
        return cadMaterial ;
    }
    
}