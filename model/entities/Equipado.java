package model.entities;

import java.util.ArrayList;
import model.enums.ItemEspecialEnum;

class Equipado {
    
    //Diversas habilidades aumentam a quantidade de itens equipaveis nas maos ou braços.
    private int maximoDeSeguraveis = 2;
    private int qtdSeguraveisAtual = 0;
    private ArrayList<Item> segurando = new ArrayList<Item>();
    private ItemDefesa armadura;
    
    public Equipado(){}
    
    public void equiparItem(Item item){
        //Se for uma armadura e não for a que já estiver equipada
        if(ItemDefesa.class.isInstance(item) && !armadura.equals(item)){
            desequiparArmadura();
            equiparArmadura((ItemDefesa) item);
        }
        //Se for um item corpo a corpo e já não estiver equipada.
        else if(ItemCorpoACorpo.class.isInstance(item) && !segurando.contains(item)){
            
            if(verificaUmaMao(item)){
                if( verificaUltrapassaLimiteMaos(1) ){
                    qtdSeguraveisAtual++;
                    segurarItem(item);
                }    
            } else if(verificaDuasMaos(item)){
                if( verificaUltrapassaLimiteMaos(2) ){
                    qtdSeguraveisAtual += 2;
                    segurarItem(item);
                } 
            }
            
        }
    }
    
    private boolean verificaUmaMao(Item item){
        return item.getEspecial().contains( ItemEspecialEnum.OcupaMao );
    }
    
    private boolean verificaDuasMaos(Item item){
        return item.getEspecial().contains( ItemEspecialEnum.DuasMaos );
    }
    
    private boolean verificaUltrapassaLimiteMaos(int modificadorMaos){
        if(qtdSeguraveisAtual + modificadorMaos <= maximoDeSeguraveis){
            return true;
        }
        return false;
    }
    
    private void segurarItem(Item item){
        this.segurando.add(item);
    }
    
    private void soltarItem(Item item){
        
    }
    
    public void equiparArmadura(ItemDefesa item){
        this.armadura = item;
    }
    
    public void desequiparArmadura(){
        this.armadura = null;
    }
    
    public void desequiparItens(){
        this.segurando.clear();
        this.armadura = null;
    }

    public int getMaximoDeSeguraveis() {
        return maximoDeSeguraveis;
    }

    public void setMaximoDeSeguraveis(int maximoDeSeguraveis) {
        this.maximoDeSeguraveis = maximoDeSeguraveis;
    }
}