package view.gui;

public class ArquivoMaterial extends ModeloArquivo{
    public ArquivoMaterial(){  
        setTitle("Materiais Cadastrados");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/submenu/icons8-medieval-20.png")));
        
        jpDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder("Material - Descrição"));
        
    }
}