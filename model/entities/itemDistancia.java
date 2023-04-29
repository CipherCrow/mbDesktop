package model.entities;

public class itemDistancia extends Item {
    private int distancia;

    public itemDistancia(){}
    
    public itemDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
}
