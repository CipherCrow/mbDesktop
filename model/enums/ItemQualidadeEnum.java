package model.enums;

public enum ItemQualidadeEnum {
    Baixa("Baixa", 0.5, -1, 0),
    Media("Média", 1.0, 0, 0),
    Alta("Alta", 3.0, 0, 1),
    ObraPrima("Obra-Prima", 10.0, 1, 1);

    private String nivelQualidade;
    private double multiplicadorCusto;
    private int modAcerto;
    private int modDano;
    
    ItemQualidadeEnum(
            String nivelQualidade,
            double multiplicadorCusto,
            int modAcerto,
            int modDano) {
        this.nivelQualidade = nivelQualidade;
        this.multiplicadorCusto = multiplicadorCusto;
        this.modAcerto = modAcerto;
        this.modDano = modDano;
    }

    public String getNivelQualidade() {
        return nivelQualidade;
    }

    public double getMultiplicadorCusto() {
        return multiplicadorCusto;
    }

    public int getModAcerto() {
        return modAcerto;
    }

    public int getModDano() {
        return modDano;
    }   
}