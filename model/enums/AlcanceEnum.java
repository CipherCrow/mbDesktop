package model.enums;

public enum AlcanceEnum {
    Cac(
            "Corpo-a-Corpo",
            "Adjacente."),
    Haste(
            "Haste",
            "Até 3 metros de distancia."),
    Curto(
            "Curto",
            "30 metros."),
    Medio(
            "Médio",
            "100 metros."),
    Longo(
            "Longo",
            "300 metros.");
    
    private String alcance, descricao;
    
    AlcanceEnum(String alcance,String descricao){
        this.alcance = alcance;
        this.descricao = descricao;
    }
    
    public String getAlcance(){
        return this.alcance;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
}
