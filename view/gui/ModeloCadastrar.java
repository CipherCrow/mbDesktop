
package view.gui;

/**
 *
 * @author Administrador
 */
public abstract class ModeloCadastrar extends javax.swing.JInternalFrame {
       
    /**
     * Creates new form ModeloCadastrar
     */
    public ModeloCadastrar() {
        initComponents();
    }
    
    public void resetarTituloIcone(String titulo, String caminhoIcone){
        setTitle(titulo);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource(caminhoIcone)));
    }
    
    public void iniciarCadastro(){
        jbNovo.setEnabled(false);
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        
        habilitarCampos(true);
    }
    
    public void resetCadastro(){
        jbNovo.setEnabled(true);
        jbSalvar.setEnabled(false);
        jbCancelar.setEnabled(false);
        
        habilitarCampos(false);
        limparCampos();
    }
    
    public abstract void habilitarCampos(boolean logica);
    public abstract void limparCampos();
    public abstract void salvarMaterial(String modo);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpCamposDeFiltro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jbNovo = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbDeletar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Modelo Salvar e Alterar");

        jpCamposDeFiltro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpCamposDeFiltro.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 10));

        jLabel2.setText("Id");
        jpCamposDeFiltro.add(jLabel2);

        jtfId.setEnabled(false);
        jpCamposDeFiltro.add(jtfId);

        jLabel1.setText("Nome");
        jpCamposDeFiltro.add(jLabel1);

        jtfNome.setEnabled(false);
        jpCamposDeFiltro.add(jtfNome);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/cadastros/icons8-plus-20.png"))); // NOI18N
        jbNovo.setMnemonic('n');
        jbNovo.setText("Novo");
        jbNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/cadastros/icons8-create-20.png"))); // NOI18N
        jbAlterar.setMnemonic('a');
        jbAlterar.setText("Alterar");
        jbAlterar.setEnabled(false);

        jbDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/cadastros/icons8-trash-20.png"))); // NOI18N
        jbDeletar.setMnemonic('d');
        jbDeletar.setText("Deletar");
        jbDeletar.setEnabled(false);

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/cadastros/icons8-checkmark-25.png"))); // NOI18N
        jbSalvar.setMnemonic('s');
        jbSalvar.setText("Salvar");
        jbSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbSalvar.setEnabled(false);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/cadastros/icons8-cancel-25.png"))); // NOI18N
        jbCancelar.setMnemonic('c');
        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpCamposDeFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jpCamposDeFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        iniciarCadastro();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        resetCadastro();
    }//GEN-LAST:event_jbCancelarActionPerformed
    
    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        salvarMaterial("Salvar");
    }//GEN-LAST:event_jbSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton jbAlterar;
    public javax.swing.JButton jbCancelar;
    public javax.swing.JButton jbDeletar;
    public javax.swing.JButton jbNovo;
    public javax.swing.JButton jbSalvar;
    public javax.swing.JPanel jpCamposDeFiltro;
    public javax.swing.JTextField jtfId;
    public javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables
}
