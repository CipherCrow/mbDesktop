package model.jdbc;

public enum TabelasEnum {
    Antecedente(""),
    Caminho(""),
    Raca(""),
    Classe(""),
    Habilidade(""),
    Idioma(
            "CREATE TABLE idioma" +
            "(cod_idioma INT PRIMARY KEY AUTO_INCREMENT" +
            ",nom_idioma VARCHAR(255) NOT NULL" +
            ",nom_idiomaDeReferencia VARCHAR(255) NULL)"),
    Item(""),
    Material(
            "CREATE TABLE material"
                    + "(cod_material INT PRIMARY KEY AUTO_INCREMENT"
                    + ", nom_material VARCHAR(255) NOT NULL"
                    + ", qtd_multCusto NUMERIC(3,1) NOT NULL"
                    + ", qtd_multDano NUMERIC(3,1) NOT NULL"
                    + ", qtd_modDano INT NOT NULL"
                    + ", qtd_modFn   INT NOT NULL"
                    + ", qtd_multPeso NUMERIC(3,1) NOT NULL)"),
    Organizacao(""),
    Personagem("");
    
    private final String sqlCriacaoTabela;
    
    TabelasEnum(String sql){
        this.sqlCriacaoTabela = sql;
    }
    
    public String getSqlCriacao(){
        return this.sqlCriacaoTabela;
    }
}
