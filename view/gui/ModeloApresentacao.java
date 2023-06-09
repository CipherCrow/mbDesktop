/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view.gui;

/**
 *
 * @author Administrador
 */
public class ModeloApresentacao extends javax.swing.JInternalFrame {

    /**
     * Creates new form ModeloApresentacao
     */
    public ModeloApresentacao() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpImagens = new javax.swing.JPanel();
        jlImagem = new javax.swing.JLabel();
        jtTextoApresentacao = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setTitle("Modelo Apresentação");
        setFrameIcon(null);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jpImagens.setBackground(new java.awt.Color(204, 204, 204));
        jpImagens.setLayout(new javax.swing.BoxLayout(jpImagens, javax.swing.BoxLayout.LINE_AXIS));

        jlImagem.setMaximumSize(new java.awt.Dimension(490, 268));
        jlImagem.setMinimumSize(new java.awt.Dimension(490, 268));
        jlImagem.setPreferredSize(new java.awt.Dimension(490, 268));
        jpImagens.add(jlImagem);

        jtTextoApresentacao.setEditable(false);
        jtTextoApresentacao.setColumns(20);
        jtTextoApresentacao.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jtTextoApresentacao.setLineWrap(true);
        jtTextoApresentacao.setRows(5);
        jtTextoApresentacao.setToolTipText("");
        jtTextoApresentacao.setWrapStyleWord(true);
        jtTextoApresentacao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtTextoApresentacao.setPreferredSize(null);
        jtTextoApresentacao.setSelectionColor(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpImagens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jtTextoApresentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpImagens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtTextoApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jlImagem;
    private javax.swing.JPanel jpImagens;
    public javax.swing.JTextArea jtTextoApresentacao;
    // End of variables declaration//GEN-END:variables
}
