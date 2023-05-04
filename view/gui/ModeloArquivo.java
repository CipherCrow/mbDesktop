/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view.gui;

/**
 *
 * @author Administrador
 */
public class ModeloArquivo extends javax.swing.JInternalFrame {

    /**
     * Creates new form IfModeloArquivo
     */
    public ModeloArquivo() {
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

        jpDescricao = new javax.swing.JPanel();
        jpImagem = new javax.swing.JPanel();
        jspTextoScroll = new javax.swing.JScrollPane();
        jtpTextoDescricao = new javax.swing.JTextPane();
        jbDetalhe = new javax.swing.JButton();
        jspPainelDeScroll = new javax.swing.JScrollPane();
        jtTabela = new javax.swing.JTable();
        jpCamposDeFiltro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jbRemoverFiltros = new javax.swing.JButton();
        jbFiltrar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Modelo de Arquivo");

        jpDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder("Modelo - Descrição"));

        jpImagem.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jpImagem.setPreferredSize(new java.awt.Dimension(160, 160));

        javax.swing.GroupLayout jpImagemLayout = new javax.swing.GroupLayout(jpImagem);
        jpImagem.setLayout(jpImagemLayout);
        jpImagemLayout.setHorizontalGroup(
            jpImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );
        jpImagemLayout.setVerticalGroup(
            jpImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );

        jtpTextoDescricao.setEditable(false);
        jtpTextoDescricao.setText("Aqui ficará o texto formatado de descrição");
        jspTextoScroll.setViewportView(jtpTextoDescricao);

        jbDetalhe.setMnemonic('d');
        jbDetalhe.setText("Detalhes");

        javax.swing.GroupLayout jpDescricaoLayout = new javax.swing.GroupLayout(jpDescricao);
        jpDescricao.setLayout(jpDescricaoLayout);
        jpDescricaoLayout.setHorizontalGroup(
            jpDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDescricaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspTextoScroll)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDescricaoLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jpImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDescricaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jpDescricaoLayout.setVerticalGroup(
            jpDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDescricaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jspTextoScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jtTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jtTabela.setEnabled(false);
        jspPainelDeScroll.setViewportView(jtTabela);

        jpCamposDeFiltro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Nome");

        jbRemoverFiltros.setMnemonic('r');
        jbRemoverFiltros.setText("Remover Filtros");

        jbFiltrar.setMnemonic('f');
        jbFiltrar.setText("Filtrar");

        javax.swing.GroupLayout jpCamposDeFiltroLayout = new javax.swing.GroupLayout(jpCamposDeFiltro);
        jpCamposDeFiltro.setLayout(jpCamposDeFiltroLayout);
        jpCamposDeFiltroLayout.setHorizontalGroup(
            jpCamposDeFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCamposDeFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCamposDeFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCamposDeFiltroLayout.createSequentialGroup()
                        .addComponent(jbFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbRemoverFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpCamposDeFiltroLayout.setVerticalGroup(
            jpCamposDeFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCamposDeFiltroLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jpCamposDeFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbRemoverFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpCamposDeFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jspPainelDeScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpCamposDeFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspPainelDeScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbDetalhe;
    private javax.swing.JButton jbFiltrar;
    private javax.swing.JButton jbRemoverFiltros;
    private javax.swing.JPanel jpCamposDeFiltro;
    private javax.swing.JPanel jpDescricao;
    private javax.swing.JPanel jpImagem;
    private javax.swing.JScrollPane jspPainelDeScroll;
    private javax.swing.JScrollPane jspTextoScroll;
    private javax.swing.JTable jtTabela;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextPane jtpTextoDescricao;
    // End of variables declaration//GEN-END:variables
}
