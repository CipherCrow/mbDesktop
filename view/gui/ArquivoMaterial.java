package view.gui;

import controller.ConfiguracaoController;
import model.entities.MaterialItem;

public class ArquivoMaterial extends ModeloArquivo{
    public ArquivoMaterial(){  
        
        resetarTituloIcone("Materiais Cadastrados",
                           "/assets/images/submenu/icons8-medieval-20.png");
        
        resetarPainelBordaComTitulo("Material - Descrição");
        
        String[] colunas = new String[] {
            "Nome", "Custo*" ,"Dano*","Dano+", "FN+"
        };
        
        String tela = "Material";
        
        try {
            MaterialItem [][] materiaisCarregados = {ConfiguracaoController.carregarMateriais()};
            
            resetarTabela( materiaisCarregados, colunas );
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            
            //Preenche a tabela com mensagem de vazio de hou
            resetarTabela( 
                new Object [][] {{"Ainda não existe nem um(a) "+ tela +" forjado(a)"}}
                , new String[]{"Mensagem de Hou:"}
                    );
        }
            
    }

    public void resetarTituloIcone(String titulo, String caminhoIcone){
        setTitle(titulo);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource(caminhoIcone)));
    }
    
    public void resetarPainelBordaComTitulo(String titulo){
        jpDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder(titulo));
        jtpTextoDescricao.setText("");
    }
    
    public void resetarTabela(Object[][] objeto, String[] colunas){
        jtTabela.setModel(new javax.swing.table.DefaultTableModel( objeto, colunas ));
    }
}