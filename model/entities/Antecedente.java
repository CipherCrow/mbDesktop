package model.entities;

public class Antecedente {
    private int id;
    private String nome;
    private String Requisitos;
    private Habilidade beneficio;
    private Item EquipamentoBonus;

    public Antecedente(){}

    public Antecedente(int id, String nome, String Requisitos, Habilidade beneficio, Item EquipamentoBonus) {
        this.id = id;
        this.nome = nome;
        this.Requisitos = Requisitos;
        this.beneficio = beneficio;
        this.EquipamentoBonus = EquipamentoBonus;
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

    public String getRequisitos() {
        return Requisitos;
    }

    public void setRequisitos(String Requisitos) {
        this.Requisitos = Requisitos;
    }

    public Habilidade getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(Habilidade beneficio) {
        this.beneficio = beneficio;
    }

    public Item getEquipamentoBonus() {
        return EquipamentoBonus;
    }

    public void setEquipamentoBonus(Item EquipamentoBonus) {
        this.EquipamentoBonus = EquipamentoBonus;
    }
}