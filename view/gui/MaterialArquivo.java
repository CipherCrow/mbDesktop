package view.gui;

import controller.MateriaisController;
import exceptions.CamposInvalidosException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MaterialArquivo extends ModeloArquivo{
    public MaterialArquivo(){  

        resetarTituloIcone("Materiais Cadastrados",
                           "/assets/images/submenu/icons8-medieval-20.png");
        
        resetarPainelBordaComTitulo("Material - Descrição");
             
    }


    @Override
    public void filtrar() {
        MateriaisController controller = new MateriaisController();
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
    }
    
    @Override
    public void atualizarTabela() {
        try {
            MateriaisController controller = new MateriaisController();
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
        MateriaisController controller = new MateriaisController();
        controller.atualizaDescricao(jtTabela.getSelectedRow());
        permitirAlterar( true );
    }
}