package model.entities;

public class Material {
    private int id;
    private String nome;
    private Double multiplicadorDeCusto;
    private Double multiplicadorDeDano;
    private int modificadorDeDano = 0;
    private int modificadorDeFn = 0;
    private Double multiplicadorDePeso;
    
    public String getDescricaoView(){
        String descricaoCompleta = 
                "O equipamento feito de " + this.nome.toUpperCase() + " terá seus atributos modificados em: \n\n" +
                "Custo: \t(Original * " + this.multiplicadorDeCusto + ")\n" +
                "Dano: \t(Original * " + this.multiplicadorDeDano + " ) +" + this.modificadorDeDano + "\n" +
                "Fn: \t(Original + " + this.modificadorDeFn + ")\n" +
                "Peso: \t(Original * " + this.multiplicadorDePeso + ")\n" ;
        
        return descricaoCompleta;
    }
    
    public Material(){}

    public Material(
            int id,
            String nome,
            Double multiplicadorDeCusto,
            Double multiplicadorDeDano,
            int modificadorDeDano,
            int modificadorDeFn,
            Double multiplicadorDePeso) {
        this.id = id;
        this.nome = nome;
        this.multiplicadorDeCusto = multiplicadorDeCusto;
        this.multiplicadorDeDano = multiplicadorDeDano;
        this.modificadorDeDano = modificadorDeDano;
        this.modificadorDeFn = modificadorDeFn;
        this.multiplicadorDePeso = multiplicadorDePeso;
    }
    
    public Material(
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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