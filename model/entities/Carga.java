package model.entities;

public class Carga {
    //Será feito com expressões regulares
    private int modificadorDeCarga;
    private double cargaBasica;
    private double cargaPesada;
    private double cargaMaxima;
    
    public Carga(){}
    
    public void atualizarCarga(double forca){
        this.cargaBasica = forca * 7;
        this.cargaPesada = cargaPesada * 5;
        this.cargaMaxima = cargaBasica * 10;
    }

    public double getCargaBasica() {
        return cargaBasica;
    }

    public double getCargaPesada() {
        return cargaPesada;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }
}