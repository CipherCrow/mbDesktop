package controller;

public enum ControllerTableEnum {
    Material(
        new String[] {"Nome", "Custo*" ,"Dano*","Dano+", "FN+"}
            );

    String[] arrayColunas;
    
    ControllerTableEnum(String[] camposTabela){
        this.arrayColunas = camposTabela;
    }
    
    public String[] getCamposTabela(){
        return this.arrayColunas;
    }
    
}