package view.gui;

import controller.GerenciadorDeTelas;
import controller.MaterialController;
import exceptions.CamposInvalidosException;
import java.sql.SQLException;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

public class MaterialArquivo extends ModeloArquivo{
    public MaterialArquivo(){  

        resetarTituloIcone("Materiais Cadastrados",
                           "/assets/images/submenu/icons8-medieval-20.png");
        
        resetarPainelBordaComTitulo("Material - Descrição");
        
        resetarIconeDemonstrativo("/assets/images/arquivo/icons8-iron-ore-100.png");
             
    }


    @Override
    public void filtrar() {
        MaterialController controller = new MaterialController();
        try {
            controller.filtrar( jtfNome.getText(), jtTabela );
        } catch (CamposInvalidosException e) {
            JOptionPane.showMessageDialog(null, "Existem campos vazios ou com caractéres inválidos!", "Erro ao Salvar: " + e, JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao efetuar operacao:" + e.getStackTrace(), "Erro " + e, JOptionPane.ERROR_MESSAGE);
        }    
    }

    @Override
    public void removerFiltro() {
        atualizarTabela();
        jtfNome.setText("");
    }
    
    @Override
    public void atualizarTabela() {
        try {
            MaterialController controller = new MaterialController();
            controller.carregarTudo( jtTabela );
        } catch (CamposInvalidosException e) {
            JOptionPane.showMessageDialog(null, "Existem campos vazios ou com caractéres inválidos!", "Erro ao Salvar: " + e, JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar material:" + e.getMessage(), "Erro " + e, JOptionPane.ERROR_MESSAGE);
        }  catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao efetuar operacao:" + e.getStackTrace(), "Erro " + e, JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void carregaDescricao() {
        MaterialController controller = new MaterialController();
        controller.atualizaDescricao(jtTabela.getSelectedRow(), jtTabela);
        permitirAlterar( true );
    }

    @Override
    public void carregaEdicaoSelecionado() {
        MaterialController controller = new MaterialController();
        int selecionado = jtTabela.getSelectedRow();
        int idDoSelecionadoNoBanco = selecionado + 1;
        
        ViewUtil.abrirJanela( (JDesktopPane) this.getParent() , GerenciadorDeTelas.getCadMaterial(
                                                                                        "Alterar-" + selecionado ,
                                                                                        idDoSelecionadoNoBanco + ""));
    }
}