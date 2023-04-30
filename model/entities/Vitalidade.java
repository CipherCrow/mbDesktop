package model.entities;

class Vitalidade {
    private int pontosDeVida = 60;
    private int pontosDeMana = 60;

    public Vitalidade(){}
    
    public Vitalidade(int pontosDeVida, int pontosDeMana){
        this.pontosDeVida = pontosDeVida;
        this.pontosDeMana = pontosDeMana;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public int getPontosDeMana() {
        return pontosDeMana;
    }

    public void setPontosDeMana(int pontosDeMana) {
        this.pontosDeMana = pontosDeMana;
    }
    
}