package model.enums;

public enum TipoDanoEnum {
    Corte("Corte"),
    Perfuracao("Perfuração"),
    Contusao("Contusão"),
    Dreno("Dreno de Vida"),
    Fogo("Fogo"),
    Frio("Frio"),
    Eletricidade("Eletricidade");
    
    private final String tipoDeDano;
    TipoDanoEnum(String tipoDeDano){
        this.tipoDeDano = tipoDeDano;
    }
    
    public String getTipoDeDano(){
        return this.tipoDeDano;
    }
}
