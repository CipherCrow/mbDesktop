package view.gui;

import controller.GerenciadorDeTelas;
import controller.IdiomaController;
import controller.IdiomaController;
import exceptions.CamposInvalidosException;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class IdiomaCadastro extends ModeloCadastrar {
    
    public JTextField jtfIdiomaReferencia;
    public JLabel jlIdiomaReferencia;
    
    public IdiomaCadastro(){
        preencherConteudo();
        iniciarModoCadastro();
    } 
    
    public IdiomaCadastro(int idIdiomaParaEdicao){
        preencherConteudo();
        prepararParaEdicao(idIdiomaParaEdicao);
        iniciarModoAlteracao();
    }
    
    @Override
    public void preencherConteudo(){
        Dimension grande = new Dimension(200, 28);
        Dimension pequeno = new Dimension(60, 28);
        
        resetarTituloIcone(
                "Cadastrar Idioma"
               ,"/assets/images/submenu/icons8-spoken-20(1).png");

        jtfId.setPreferredSize(pequeno);       
        jtfNome.setPreferredSize(grande);
        
        jlIdiomaReferencia = new JLabel("Idioma De Referencia");       
        jtfIdiomaReferencia = new JTextField();
        jtfIdiomaReferencia.setPreferredSize(grande);
                
        jpCamposDeFiltro.add(jlIdiomaReferencia);
        jpCamposDeFiltro.add(jtfIdiomaReferencia);
  
        jpCamposDeFiltro.setPreferredSize(new Dimension(jpCamposDeFiltro.getWidth(), jpCamposDeFiltro.getHeight() - 200));
        
        habilitarCampos(false);
    }
    
    @Override
    public void prepararParaEdicao(int idMaterialParaEdicao){
               
        try { 
            IdiomaController controller = new IdiomaController();
            ArrayList<JTextField> camposParaEditar = new ArrayList<>();
            camposParaEditar.add(jtfId);
            camposParaEditar.add(jtfNome);
            camposParaEditar.add(jtfIdiomaReferencia);
//            camposParaEditar.add(jtfDanoMultiplicavel);
            
            controller.carregarParaEdicao(idMaterialParaEdicao, camposParaEditar);
            setTitle("Editando "+jtfNome.getText());
            
        }catch(Exception e){
            System.err.println( e.getMessage() );
            e.printStackTrace();
            ExceptionHandler.exibirExcecaoDialog(e);
        }
        
    }
        
    @Override
    public void habilitarCampos(boolean logica) {
        jtfNome.setEnabled(logica);
        jtfIdiomaReferencia.setEnabled(logica);
//        jtfDanoMultiplicavel.setEnabled(logica);
    }
    
    @Override
    public void limparCampos() {
        jtfId.setText("");
        jtfNome.setText("");
        jtfIdiomaReferencia.setText("");
//        jtfDanoMultiplicavel.setText(""); 
    }
        
    @Override
    public void salvarRegistro(){
        
        try{
            IdiomaController controller = new IdiomaController();
                        
            if (getModo().equals("Alt") ){
                controller.alterar(
                    jtfId.getText(),
                    jtfNome.getText(),
                    jtfIdiomaReferencia.getText()
//                    jtfDanoMultiplicavel.getText(),
                );
                JOptionPane.showMessageDialog(null, "Idioma Alterado Com Sucesso", "Sucesso ao Alterar Idioma", JOptionPane.INFORMATION_MESSAGE);
            }else{
                controller.inserir(
                    jtfNome.getText(),
                    jtfIdiomaReferencia.getText()
//                    jtfDanoMultiplicavel.getText(),
                );
                JOptionPane.showMessageDialog(null, "Idioma Salvo Com Sucesso", "Sucesso ao Salvar Idioma", JOptionPane.INFORMATION_MESSAGE);
                limparCampos();
            }  
            
            habilitarCampos(false);
            resetCadastro();
            controller.carregarTudo( GerenciadorDeTelas.getArqIdioma().jtTabela );
            
        }catch(CamposInvalidosException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Algum dos campos inseridos está nulo ou é invalido","Campos inválidos!", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
            e.printStackTrace();
            ExceptionHandler.exibirExcecaoDialog(e);
        }
        
    }
    
    public void deletarRegistro(){
        try {
                IdiomaController controller = new IdiomaController();
                controller.deletar( jtfId.getText() );
                GerenciadorDeTelas.removerCadIdioma(jtfId.getText() );
                
                JOptionPane.showMessageDialog(null, "Registro Deletado Com Sucesso", "Sucesso ao Deletar", JOptionPane.INFORMATION_MESSAGE);
                setVisible(false);
                setClosed(true);
        } catch (Exception e) {
            ExceptionHandler.exibirExcecaoDialog(e);
        }
    }
}