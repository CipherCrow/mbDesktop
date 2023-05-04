package view.gui;

import javax.swing.JLabel;

public class BoasVindas extends ModeloApresentacao {
       
    public BoasVindas(){ 
        super();
        
        setTitle("Seja bem-vindo(a) ao Mighty Blade RPG!");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/menu/icons8-handshake-heart-35.png")));
        
        texto.setText(" O Mighty Blade é um sistema nacional criado pelo game designer Tiago Junges em 2003. A sua principal vantagem, além de ser gratuito, é o tempo."
                + " A curva de aprendizagem é bem curta e pessoas com nenhuma experiência em RPG começam a jogar em pouquíssimo tempo.\n \n"
                + " Através do Mighty Ficha, você poderá criar e administrar as fichas de seus personagens para o sistema Mighty Blade. Além disso, devido ao seu caratér modular(igual ao sistema hehe),"
                + " poderá adicionar seus homebrews diretamente no programa!\n");
        
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource(""
                + "/assets/images/logoGrrrande.png")));  
    }    
}