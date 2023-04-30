package model.entities;

class MaterialItem {
    private String nome;
    private Double multiplicadorDeCusto;
    private Double multiplicadorDeDano;
    private int modificadorDeDano;
    private int modificadorDeFn;
    private Double multiplicadorDePeso;

    public MaterialItem(){}

    public MaterialItem(
            String nome,
            Double multiplicadorDeCusto,
            Double multiplicadorDeDano,
            int modificadorDeDano,
            int modificadorDeFn,
            Double multiplicadorDePeso) {
        this.nome = nome;
        this.multiplicadorDeCusto = multiplicadorDeCusto;
        this.multiplicadorDeDano = multiplicadorDeDano;
        this.modificadorDeDano = modificadorDeDano;
        this.modificadorDeFn = modificadorDeFn;
        this.multiplicadorDePeso = multiplicadorDePeso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getMultiplicadorDeCusto() {
        return multiplicadorDeCusto;
    }

    public void setMultiplicadorDeCusto(Double multiplicadorDeCusto) {
        this.multiplicadorDeCusto = multiplicadorDeCusto;
    }

    public Double getMultiplicadorDeDano() {
        return multiplicadorDeDano;
    }

    public void setMultiplicadorDeDano(Double multiplicadorDeDano) {
        this.multiplicadorDeDano = multiplicadorDeDano;
    }

    public int getModificadorDeDano() {
        return modificadorDeDano;
    }

    public void setModificadorDeDano(int modificadorDeDano) {
        this.modificadorDeDano = modificadorDeDano;
    }

    public int getModificadorDeFn() {
        return modificadorDeFn;
    }

    public void setModificadorDeFn(int modificadorDeFn) {
        this.modificadorDeFn = modificadorDeFn;
    }

    public Double getMultiplicadorDePeso() {
        return multiplicadorDePeso;
    }

    public void setMultiplicadorDePeso(Double multiplicadorDePeso) {
        this.multiplicadorDePeso = multiplicadorDePeso;
    }
 }