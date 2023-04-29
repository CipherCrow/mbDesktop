package model.entities;

public class itemDistancia extends Item {
    private int distancia;
    private String forcaNecessaria;

    public itemDistancia(){}
    
    public itemDistancia(int distancia, String forcaNecessaria) {
        this.distancia = distancia;
        this.forcaNecessaria = forcaNecessaria;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public String getForcaNecessaria() {
        return forcaNecessaria;
    }

    public void setForcaNecessaria(String forcaNecessaria) {
        this.forcaNecessaria = forcaNecessaria;
    }
    
    
}
