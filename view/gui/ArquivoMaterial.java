package view.gui;

import controller.ControllerTableEnum;
import controller.MateriaisController;

public class ArquivoMaterial extends ModeloArquivo{
    public ArquivoMaterial(){  

        resetarTituloIcone("Materiais Cadastrados",
                           "/assets/images/submenu/icons8-medieval-20.png");
        
        resetarPainelBordaComTitulo("Material - Descrição");
        
        resetarTabela(ControllerTableEnum.Material.getCamposTabela(),"material");      
    }

    public void resetarTituloIcone(String titulo, String caminhoIcone){
        setTitle(titulo);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource(caminhoIcone)));
    }
    
    public void resetarPainelBordaComTitulo(String titulo){
        jpDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder(titulo));
        jtpTextoDescricao.setText("");
    }
    
    public void resetarTabela(String[] colunas, String tabela){
        MateriaisController controller = new MateriaisController();
         
        try { 
            controller.carregarMateriais(colunas, jtTabela);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            
            //Preenche a tabela com mensagem de vazio de hou
            nenhumResultadoCadastrado(tabela);
        }   
    }
    
    public void nenhumResultadoEncontrado(){
        //nothing
    }
    
    public void nenhumResultadoCadastrado(String texto){
        jtTabela.setModel(new javax.swing.table.DefaultTableModel( 
            new Object [][] {{"Ainda não existe nem um(a) " + texto + " forjado(a)"}}
          , new String[]{"Mensagem de Hou:"}
        ));
    }
}