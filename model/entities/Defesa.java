package model.entities;

class Defesa {
    private int bloqueio;
    private int esquiva;
    private int determinacao;
    
    private int modificadorArmadura = 0;
    private int modificadorBloqueioHab = 0;
    
    private int modificadorEsquivaHab = 0;
    
    private int modificadorDeterminacaoHab = 0;
    
    public Defesa(){}
    
    public void atualizarDefesa(Atributos atributos){
        this.bloqueio = atributos.getForca() + modificadorArmadura + modificadorBloqueioHab;
        this.esquiva = atributos.getAgilidade() + modificadorArmadura + modificadorEsquivaHab;
        
        if(atributos.getInteligencia() > atributos.getVontade()){
            this.determinacao = atributos.getInteligencia() + modificadorDeterminacaoHab;
        }else{
            this.determinacao = atributos.getVontade() + modificadorDeterminacaoHab;
        }       
    }
}