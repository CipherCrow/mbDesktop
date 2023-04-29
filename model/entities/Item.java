package model.entities;

import java.util.ArrayList;
import model.enums.AlcanceEnum;
import model.enums.ItemEspecialEnum;
import model.enums.TipoDanoEnum;

public class Item {
    private String nome;
    private double custo;
    private double peso = 0;
    private String descricao;
    private QualidadeItem qualidadeDoItem;
    private MaterialItem materialDoItem;

    public Item() {}

    public Item(
            String nome,
            double custo,
            String descricao, 
            QualidadeItem qualidadeDoItem, 
            MaterialItem materialDoItem) {
        this.nome = nome;
        this.custo = custo;
        this.descricao = descricao;
        this.qualidadeDoItem = qualidadeDoItem;
        this.materialDoItem = materialDoItem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public QualidadeItem getQualidadeDoItem() {
        return qualidadeDoItem;
    }

    public void setQualidadeDoItem(QualidadeItem qualidadeDoItem) {
        this.qualidadeDoItem = qualidadeDoItem;
    }

    public MaterialItem getMaterialDoItem() {
        return materialDoItem;
    }

    public void setMaterialDoItem(MaterialItem materialDoItem) {
        this.materialDoItem = materialDoItem;
    }
     
    
    
    
}