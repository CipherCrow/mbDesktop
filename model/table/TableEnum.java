package model.table;

public enum TableEnum {
    Material(
        new String[] {"Nome", "Custo*" ,"Dano*","Dano+", "FN+", "Peso*"}
            );

    String[] arrayColunas;
    
    TableEnum(String[] camposTabela){
        this.arrayColunas = camposTabela;
    }
    
    public String[] getCamposTabela(){
        return this.arrayColunas;
    }
    
}