package view.gui;

import controller.ConfiguracaoController;

public class ArquivoMaterial extends ModeloArquivo{
    public ArquivoMaterial(){  

        resetarTituloIcone("Materiais Cadastrados",
                           "/assets/images/submenu/icons8-medieval-20.png");
        
        resetarPainelBordaComTitulo("Material - Descrição");
        
        String[] colunas = new String[] {
            "Nome", "Custo*" ,"Dano*","Dano+", "FN+"
        };
        
        resetarTabela(colunas,"material");      
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
        ConfiguracaoController controller = new ConfiguracaoController();
         
        try { 
            controller.carregarMateriais(colunas, jtTabela);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            
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