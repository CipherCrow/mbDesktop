package view.gui;

import java.awt.Component;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

public class ViewUtil {
    
    public static void abrirJanela(JDesktopPane jdpAreaDeTrabalho, JInternalFrame janela){
        try{ 
            Component[] componentes = jdpAreaDeTrabalho.getComponents();
            boolean jaExisteComponente = false;
            
            System.out.println("Area de Trabalho esta atualmente com :");
            for(int i=0; i < componentes.length ; i++){
                JInternalFrame atual = (JInternalFrame) componentes[i];
                System.out.println( atual.getTitle() );
            }
            
            for(int i=0; i < jdpAreaDeTrabalho.getComponentCount(); i++){
                //Se for o mesmo componente e a janela não estiver visivel significa que foi fechada, portanto:
                JInternalFrame atual = (JInternalFrame) componentes[i];
                if (atual.equals( janela )){
                    System.out.println("A janela + '"+ atual.getTitle() + "' e identica a '" + janela.getTitle() + "'");
                    jaExisteComponente = true;
                }
            }
            
            if(jaExisteComponente){
                janela.setClosed(false);
            }else{
                //Realiza calculos para gerar a janela centralizada;
                int larguraDesktop = jdpAreaDeTrabalho.getWidth();
                int alturaDesktop = jdpAreaDeTrabalho.getHeight();
                
                int larguraFrame = janela.getWidth();
                int alturaFrame = janela.getHeight();
                janela.setLocation( larguraDesktop / 2 - larguraFrame / 2, alturaDesktop / 2 - alturaFrame / 2);
                
                jdpAreaDeTrabalho.add( janela );
            }
            
            janela.setVisible(true);
            janela.setSelected(true);
            
        }catch(Exception e){
            System.err.println(e.getMessage());
            e.printStackTrace();
            ExceptionHandler.exibirExcecaoDialog(e);
        }          
    }
    
}