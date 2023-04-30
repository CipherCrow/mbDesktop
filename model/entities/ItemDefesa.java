package model.entities;

public class ItemDefesa extends Item {
    private int defesa;

    public ItemDefesa(){}

    public ItemDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}