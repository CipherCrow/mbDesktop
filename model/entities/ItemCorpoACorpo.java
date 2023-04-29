package model.entities;

import java.util.ArrayList;
import model.enums.AlcanceEnum;
import model.enums.ItemEspecialEnum;
import model.enums.TipoDanoEnum;

public class ItemCorpoACorpo {
    private int dano;
    private ArrayList<TipoDanoEnum> tipoDeDano;
    private String forcaNecessaria;
    private AlcanceEnum alcance;
    private ItemEspecialEnum especial;
    private String Observacao;

    public ItemCorpoACorpo(){}

    public ItemCorpoACorpo(
            int dano,
            ArrayList<TipoDanoEnum> tipoDeDano, 
            String forcaNecessaria,
            AlcanceEnum alcance,
            ItemEspecialEnum especial,
            String Observacao) {
        this.dano = dano;
        this.tipoDeDano = tipoDeDano;
        this.forcaNecessaria = forcaNecessaria;
        this.alcance = alcance;
        this.especial = especial;
        this.Observacao = Observacao;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public ArrayList<TipoDanoEnum> getTipoDeDano() {
        return tipoDeDano;
    }

    public void setTipoDeDano(ArrayList<TipoDanoEnum> tipoDeDano) {
        this.tipoDeDano = tipoDeDano;
    }

    public String getForcaNecessaria() {
        return forcaNecessaria;
    }

    public void setForcaNecessaria(String forcaNecessaria) {
        this.forcaNecessaria = forcaNecessaria;
    }

    public AlcanceEnum getAlcance() {
        return alcance;
    }

    public void setAlcance(AlcanceEnum alcance) {
        this.alcance = alcance;
    }

    public ItemEspecialEnum getEspecial() {
        return especial;
    }

    public void setEspecial(ItemEspecialEnum especial) {
        this.especial = especial;
    }

    public String getObservacao() {
        return Observacao;
    }

    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
    }
}