package model.entities;

class QualidadeItem {
    private String nome;
    private Double MultiplicadorDeCusto;
    private int modificadorDano;
    private int modificadorAcerto;

    public QualidadeItem(){}

    public QualidadeItem(
            String nome,
            Double MultiplicadorDeCusto,
            int modificadorDano,
            int modificadorAcerto) {
        this.nome = nome;
        this.MultiplicadorDeCusto = MultiplicadorDeCusto;
        this.modificadorDano = modificadorDano;
        this.modificadorAcerto = modificadorAcerto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCusto() {
        return MultiplicadorDeCusto;
    }

    public void setCusto(Double MultiplicadorDeCusto) {
        this.MultiplicadorDeCusto = MultiplicadorDeCusto;
    }

    public int getDanoExtra() {
        return modificadorDano;
    }

    public void setDanoExtra(int modificadorDano) {
        this.modificadorDano = modificadorDano;
    }

    public int getBonusAcertoExtra() {
        return modificadorAcerto;
    }

    public void setBonusAcertoExtra(int modificadorAcerto) {
        this.modificadorAcerto = modificadorAcerto;
    }
    
    
    
}