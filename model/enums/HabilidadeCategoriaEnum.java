package model.enums;

public enum HabilidadeCategoriaEnum {
    Caracteristica("Característica"),
    Magia("Magia"),
    Musica("Música"),
    Tecnica("Técnica"),
    Padrao("Padrão");
    
    private final String categoria;
    HabilidadeCategoriaEnum(String categoria){
        this.categoria = categoria;
    }
    public String getCategoria(){
        return this.categoria;
    }
}
