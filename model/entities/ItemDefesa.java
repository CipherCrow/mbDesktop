package model.entities;

public class ItemDefesa extends Item {
    private int defesa;
    private String forcaNecessaria;

    public ItemDefesa(){}

    public ItemDefesa(int defesa, String forcaNecessaria) {
        this.defesa = defesa;
        this.forcaNecessaria = forcaNecessaria;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public String getForcaNecessaria() {
        return forcaNecessaria;
    }

    public void setForcaNecessaria(String forcaNecessaria) {
        this.forcaNecessaria = forcaNecessaria;
    }
}