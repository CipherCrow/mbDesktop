package model.enums;

public enum HabilidadeMagiaEnum {
    Arcana("Arcana"),
    Mistica("Mística"),
    Esoterica("Esotérica");
    
    private String runa;
    HabilidadeMagiaEnum(String runa){
        this.runa = runa;
    }
    
    private String tipoRuna(){
        return this.runa;
    }
}