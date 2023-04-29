package model.entities;

class Movimentacao {
    //Alterado por algumas habilidades, armaduras e circunstancias.
    private int modificadorDeMovimentacao;
    private final int modificadorPadrao = 4;
    private int deslocamento;
    private int corrida;
    
    public Movimentacao(){ resetarModificadorDeMovimento(); }
    
    private void resetarModificadorDeMovimento(){ this.modificadorDeMovimentacao = this.modificadorPadrao; };

    private void atualizaMovimentacao(int agilidade){
        this.deslocamento = (agilidade / 2) + 5;
        this.corrida = modificadorDeMovimentacao * deslocamento;
    }
     
    private void atualizarModificadorDeMovimentacao(int atualizador){
        this.modificadorDeMovimentacao += atualizador;
    }

    public int getModificadorDeMovimentacao() {
        return modificadorDeMovimentacao;
    }

    public int getDeslocamento() {
        return deslocamento;
    }

    public int getCorrida() {
        return corrida;
    }  
}