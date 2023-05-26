package model.jdbc;

public enum TabelasEnum {
    Antecedente(""),
    Caminho(""),
    Raca(""),
    Classe(""),
    Habilidade(
            "CREATE TABLE habilidade" +
            "(cod_habilidade INT PRIMARY KEY" +
            ",nom_habilidade VARCHAR(MAX) NOT NULL" +
            ",nom_categoria VARCHAR(MAX) NOT NULL" +
            ",nom_tipo VARCHAR(MAX) NOT NULL" +
            ",nro_mana INT NULL" +
            ",nro_dificuldade INT NULL" +
            ",des_resumo VARCHAR(MAX) NOT NULL)"),
    Requisito(
            "CREATE TABLE requisito" +
            "(cod_requisito INT PRIMARY KEY" +
            ",nro_for INT NULL," +
            ",nro_agi INT NULL," +
            ",nro_int INT NULL," +
            ",nro_von INT NULL," +
            ",des_feito VARCHAR(MAX) NULL)"),
    RequisitoHabilidade(
            "CREATE TABLE requisito_habilidade" +
            "(cod_requisito_habilidade INT PRIMARY KEY" +
            ",cod_habilidade INT NOT NULL" +
            ",cod_requisito INT NOT NULL" +
            ",FOREIGN KEY (cod_habilidade) REFERENCES habilidade(cod_habilidade)" +
            ",FOREIGN KEY (cod_requisito) REFERENCES requisito(cod_requisito))"),
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
