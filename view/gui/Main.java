package view.gui;

import controller.GerenciadorDeTelas;
import controller.PopuladorDeBanco;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        
        iniciaBancoDeDados();
        
        URL url = this.getClass().getResource("/assets/images/iconeMB.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        
        BoasVindas mAparesentacao = new BoasVindas();
        mAparesentacao.setVisible(true);
        
        jdpAreaDeTrabalho.add(mAparesentacao);
        mAparesentacao.requestFocusInWindow();
        mAparesentacao.requestFocus();
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void iniciaBancoDeDados(){
        try {            
            PopuladorDeBanco populador = new PopuladorDeBanco();
            populador.criaOBanco();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao iniciar banco de dados da apicação, por gentileza reinicie a aplicação!", "Erro " + e, JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void abrirJanela(JInternalFrame janela){
        try{ 
            Component[] componentes = jdpAreaDeTrabalho.getComponents();
            boolean jaExisteComponente = false;
            
            for(int i=0; i < jdpAreaDeTrabalho.getComponentCount(); i++){
                //Se for o mesmo componente e a janela não estiver visivel significa que foi fechada, portanto:
                if (componentes[i].equals( janela )){
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
            JOptionPane.showMessageDialog(null, "Erro ao Tentar Abrir a Janela"+ janela.getTitle() +"!", "Erro", JOptionPane.ERROR_MESSAGE);
        }          
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpAreaDeTrabalho = new javax.swing.JDesktopPane();
        jmbBarraMenu = new javax.swing.JMenuBar();
        jmArquivo = new javax.swing.JMenu();
        jmiPersonagens = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiAntecedentes = new javax.swing.JMenuItem();
        jmiRacas = new javax.swing.JMenuItem();
        jmiClasses = new javax.swing.JMenuItem();
        jmiCaminhos = new javax.swing.JMenuItem();
        jmiHabilidades = new javax.swing.JMenuItem();
        jmiIdiomas = new javax.swing.JMenuItem();
        jmItens = new javax.swing.JMenuItem();
        jmiMateriais = new javax.swing.JMenuItem();
        jmCadastrar = new javax.swing.JMenu();
        jmiCadPersonagem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmiCadAntecedente = new javax.swing.JMenuItem();
        jmiCadRaca = new javax.swing.JMenuItem();
        jmiCadClasse = new javax.swing.JMenuItem();
        jmiCadCaminho = new javax.swing.JMenuItem();
        jmiCadHabilidade = new javax.swing.JMenuItem();
        jmiCadIdioma = new javax.swing.JMenuItem();
        jmiCadItem = new javax.swing.JMenuItem();
        jmiCadMaterial = new javax.swing.JMenuItem();
        jmFatores = new javax.swing.JMenu();
        jmImport = new javax.swing.JMenu();
        jmSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mighty Blade - Gerenciador de Personagem");
        setName("Principal"); // NOI18N
        setResizable(false);

        jdpAreaDeTrabalho.setToolTipText("");

        javax.swing.GroupLayout jdpAreaDeTrabalhoLayout = new javax.swing.GroupLayout(jdpAreaDeTrabalho);
        jdpAreaDeTrabalho.setLayout(jdpAreaDeTrabalhoLayout);
        jdpAreaDeTrabalhoLayout.setHorizontalGroup(
            jdpAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        jdpAreaDeTrabalhoLayout.setVerticalGroup(
            jdpAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );

        jmbBarraMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmbBarraMenu.setMargin(new java.awt.Insets(1, 0, 1, 0));

        jmArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/menu/icons8-search-folder-35.png"))); // NOI18N
        jmArquivo.setMnemonic('A');
        jmArquivo.setText("Arquivo");
        jmArquivo.setToolTipText("Verificar conteúdo já cadastrado");
        jmArquivo.setMargin(new java.awt.Insets(4, 6, 4, 6));

        jmiPersonagens.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiPersonagens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/submenu/icons8-person-20.png"))); // NOI18N
        jmiPersonagens.setText("Personagens");
        jmiPersonagens.setToolTipText("");
        jmArquivo.add(jmiPersonagens);
        jmArquivo.add(jSeparator1);

        jmiAntecedentes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiAntecedentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/submenu/icons8-farmer-20.png"))); // NOI18N
        jmiAntecedentes.setText("Antecedentes");
        jmArquivo.add(jmiAntecedentes);

        jmiRacas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiRacas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/submenu/icons8-fursona-20+1.png"))); // NOI18N
        jmiRacas.setText("Raças");
        jmArquivo.add(jmiRacas);

        jmiClasses.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiClasses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/submenu/icons8-warrior-20.png"))); // NOI18N
        jmiClasses.setText("Classes");
        jmArquivo.add(jmiClasses);

        jmiCaminhos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiCaminhos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/submenu/icons8-purposeful-woman-20.png"))); // NOI18N
        jmiCaminhos.setText("Caminhos");
        jmArquivo.add(jmiCaminhos);

        jmiHabilidades.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiHabilidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/submenu/icons8-book-20.png"))); // NOI18N
        jmiHabilidades.setText("Habilidades");
        jmArquivo.add(jmiHabilidades);

        jmiIdiomas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiIdiomas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/submenu/icons8-spoken-20.png"))); // NOI18N
        jmiIdiomas.setText("Idiomas");
        jmArquivo.add(jmiIdiomas);

        jmItens.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmItens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/submenu/icons8-cheap-20.png"))); // NOI18N
        jmItens.setText("Objetos");
        jmArquivo.add(jmItens);

        jmiMateriais.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiMateriais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/submenu/icons8-medieval-20.png"))); // NOI18N
        jmiMateriais.setText("Materiais");
        jmiMateriais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMateriaisActionPerformed(evt);
            }
        });
        jmArquivo.add(jmiMateriais);

        jmbBarraMenu.add(jmArquivo);

        jmCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/menu/icons8-add-folder-35.png"))); // NOI18N
        jmCadastrar.setMnemonic('c');
        jmCadastrar.setText("Cadastrar");
        jmCadastrar.setToolTipText("Cadastrar conteúdo");
        jmCadastrar.setMargin(new java.awt.Insets(4, 6, 4, 6));

        jmiCadPersonagem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiCadPersonagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/submenu/icons8-person-20(1).png"))); // NOI18N
        jmiCadPersonagem.setText("Personagem");
        jmCadastrar.add(jmiCadPersonagem);
        jmCadastrar.add(jSeparator2);

        jmiCadAntecedente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiCadAntecedente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/submenu/icons8-farmer-20(1).png"))); // NOI18N
        jmiCadAntecedente.setText("Antecedente");
        jmCadastrar.add(jmiCadAntecedente);

        jmiCadRaca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiCadRaca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/submenu/icons8-fursona-20.png"))); // NOI18N
        jmiCadRaca.setText("Raça");
        jmCadastrar.add(jmiCadRaca);

        jmiCadClasse.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiCadClasse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/submenu/icons8-warrior-20+1.png"))); // NOI18N
        jmiCadClasse.setText("Classe");
        jmCadastrar.add(jmiCadClasse);

        jmiCadCaminho.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiCadCaminho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/submenu/icons8-purposeful-woman-20(1).png"))); // NOI18N
        jmiCadCaminho.setText("Caminho");
        jmCadastrar.add(jmiCadCaminho);

        jmiCadHabilidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiCadHabilidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/submenu/icons8-book-20(1).png"))); // NOI18N
        jmiCadHabilidade.setText("Habilidade");
        jmCadastrar.add(jmiCadHabilidade);

        jmiCadIdioma.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiCadIdioma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/submenu/icons8-spoken-20(1).png"))); // NOI18N
        jmiCadIdioma.setText("Idioma");
        jmCadastrar.add(jmiCadIdioma);

        jmiCadItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiCadItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/submenu/icons8-cheap-20+1.png"))); // NOI18N
        jmiCadItem.setText("Objeto");
        jmCadastrar.add(jmiCadItem);

        jmiCadMaterial.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiCadMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/submenu/icons8-medieval-20(1).png"))); // NOI18N
        jmiCadMaterial.setText("Material");
        jmiCadMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadMaterialActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmiCadMaterial);

        jmbBarraMenu.add(jmCadastrar);

        jmFatores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/menu/icons8-folder-settings-35.png"))); // NOI18N
        jmFatores.setMnemonic('f');
        jmFatores.setText("Fatores");
        jmFatores.setToolTipText("Modificar as configurações");
        jmFatores.setMargin(new java.awt.Insets(4, 6, 4, 6));
        jmbBarraMenu.add(jmFatores);

        jmImport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/menu/icons8-exchange-folder-35.png"))); // NOI18N
        jmImport.setMnemonic('I');
        jmImport.setText("Importar");
        jmImport.setToolTipText("Importar e Exportar Materiais.");
        jmImport.setMargin(new java.awt.Insets(4, 6, 4, 6));
        jmbBarraMenu.add(jmImport);

        jmSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/menu/icons8-happy-file-35.png"))); // NOI18N
        jmSobre.setMnemonic('S');
        jmSobre.setText("Sobre");
        jmSobre.setToolTipText("Sobre o programa");
        jmSobre.setMargin(new java.awt.Insets(4, 6, 4, 6));
        jmbBarraMenu.add(jmSobre);

        setJMenuBar(jmbBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpAreaDeTrabalho)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpAreaDeTrabalho)
        );

        setSize(new java.awt.Dimension(1296, 788));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCadMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadMaterialActionPerformed
        abrirJanela(GerenciadorDeTelas.getCadMaterial());
    }//GEN-LAST:event_jmiCadMaterialActionPerformed

    private void jmiMateriaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMateriaisActionPerformed
        abrirJanela(GerenciadorDeTelas.getArqMaterial());
    }//GEN-LAST:event_jmiMateriaisActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPopupMenu.Separator jSeparator1;
    javax.swing.JPopupMenu.Separator jSeparator2;
    javax.swing.JDesktopPane jdpAreaDeTrabalho;
    javax.swing.JMenu jmArquivo;
    javax.swing.JMenu jmCadastrar;
    javax.swing.JMenu jmFatores;
    javax.swing.JMenu jmImport;
    javax.swing.JMenuItem jmItens;
    javax.swing.JMenu jmSobre;
    javax.swing.JMenuBar jmbBarraMenu;
    javax.swing.JMenuItem jmiAntecedentes;
    javax.swing.JMenuItem jmiCadAntecedente;
    javax.swing.JMenuItem jmiCadCaminho;
    javax.swing.JMenuItem jmiCadClasse;
    javax.swing.JMenuItem jmiCadHabilidade;
    javax.swing.JMenuItem jmiCadIdioma;
    javax.swing.JMenuItem jmiCadItem;
    javax.swing.JMenuItem jmiCadMaterial;
    javax.swing.JMenuItem jmiCadPersonagem;
    javax.swing.JMenuItem jmiCadRaca;
    javax.swing.JMenuItem jmiCaminhos;
    javax.swing.JMenuItem jmiClasses;
    javax.swing.JMenuItem jmiHabilidades;
    javax.swing.JMenuItem jmiIdiomas;
    javax.swing.JMenuItem jmiMateriais;
    javax.swing.JMenuItem jmiPersonagens;
    javax.swing.JMenuItem jmiRacas;
    // End of variables declaration//GEN-END:variables
}
