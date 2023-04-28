package model.enums;

public enum HabilidadeTipoEnum {
    Acao("Ação"),
    Reacao("Reação"),
    Suporte("Suporte");
    
    private final String tipo;
    
    HabilidadeTipoEnum(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return this.tipo;
    }
}
