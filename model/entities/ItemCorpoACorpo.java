package model.entities;

import java.util.ArrayList;
import model.enums.AlcanceEnum;
import model.enums.ItemEspecialEnum;
import model.enums.TipoDanoEnum;

public class ItemCorpoACorpo extends Item{
    private int dano;
    private ArrayList<TipoDanoEnum> tipoDeDano;
    private AlcanceEnum alcance;
    private String Observacao;

    public ItemCorpoACorpo(){}

    public ItemCorpoACorpo(
            int dano,
            ArrayList<TipoDanoEnum> tipoDeDano, 
            AlcanceEnum alcance,
            String Observacao) {
        this.dano = dano;
        this.tipoDeDano = tipoDeDano;
        this.alcance = alcance;
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

    public AlcanceEnum getAlcance() {
        return alcance;
    }

    public void setAlcance(AlcanceEnum alcance) {
        this.alcance = alcance;
    }

    public String getObservacao() {
        return Observacao;
    }

    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
    }
}