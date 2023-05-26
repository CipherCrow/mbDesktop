package view.gui;

import controller.GerenciadorDeTelas;
import controller.HabilidadeController;
import exceptions.CamposInvalidosException;
import java.sql.SQLException;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

public class HabilidadeArquivo extends ModeloArquivo{
    public HabilidadeArquivo(){  

        resetarTituloIcone("Habilidades Cadastradas",
                           "/assets/images/submenu/icons8-book-20.png");
        
        resetarPainelBordaComTitulo("Idioma - Descrição");
        
        resetarIconeDemonstrativo("/assets/images/arquivo/icons8-magic-100.png");
             
    }


    @Override
    public void filtrar() {
        HabilidadeController controller = new HabilidadeController();
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
            HabilidadeController controller = new HabilidadeController();
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
        HabilidadeController controller = new HabilidadeController();
        controller.atualizaDescricao(jtTabela.getSelectedRow(), jtTabela);
        permitirAlterar( true );
    }

    @Override
    public void carregaEdicaoSelecionado() {
        try {
            HabilidadeController controller = new HabilidadeController();
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