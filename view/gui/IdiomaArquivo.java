package view.gui;

import controller.GerenciadorDeTelas;
import controller.IdiomaController;
import exceptions.CamposInvalidosException;
import java.sql.SQLException;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

public class IdiomaArquivo extends ModeloArquivo{
    public IdiomaArquivo(){  

        resetarTituloIcone("Idiomas Cadastrados",
                           "/assets/images/submenu/icons8-spoken-20.png");
        
        resetarPainelBordaComTitulo("Idioma - Descrição");
        
        resetarIconeDemonstrativo("/assets/images/arquivo/icons8-talk-100.png");
             
    }


    @Override
    public void filtrar() {
        IdiomaController controller = new IdiomaController();
        try {
            controller.filtrar( jtfNome.getText(), jtTabela );
        } catch (CamposInvalidosException e) {
            JOptionPane.showMessageDialog(null, "Existem campos vazios ou com caractéres inválidos!", "Erro ao Salvar: " + e, JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            ExceptionHandler.exibirExcecaoDialog(e);
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
            IdiomaController controller = new IdiomaController();
            controller.carregarTudo( jtTabela );
        } catch (CamposInvalidosException e) {
            JOptionPane.showMessageDialog(null, "Existem campos vazios ou com caractéres inválidos!", "Erro ao Salvar: " + e, JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            ExceptionHandler.exibirExcecaoDialog(e);
        }  catch (Exception e) {
            e.printStackTrace();
            ExceptionHandler.exibirExcecaoDialog(e);
        }
    }

    @Override
    public void carregaDescricao() {
        IdiomaController controller = new IdiomaController();
        controller.atualizaDescricao(jtTabela.getSelectedRow(), jtTabela);
        permitirAlterar( true );
    }

    @Override
    public void carregaEdicaoSelecionado() {
        try {
            IdiomaController controller = new IdiomaController();
            int idDoSelecionadoNoBanco = controller.getIdDoSelecionado( jtTabela );
            
            ViewUtil.abrirJanela( (JDesktopPane) this.getParent() , GerenciadorDeTelas.getCadIdioma(
                    "Alterar-" + idDoSelecionadoNoBanco ,
                    idDoSelecionadoNoBanco + ""));
        } catch (Exception e) {
            e.printStackTrace();
            ExceptionHandler.exibirExcecaoDialog(e);
        }
    }
}