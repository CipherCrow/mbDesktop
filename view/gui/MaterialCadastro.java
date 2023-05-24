package view.gui;

import controller.GerenciadorDeTelas;
import controller.MaterialController;
import exceptions.CamposInvalidosException;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MaterialCadastro extends ModeloCadastrar {
    
    public JTextField jtfCusto, jtfDanoMultiplicavel, jtfDanoAdicional, jtfFn, jtfPesoMultiplicador;
    public JLabel jlCusto, jlDanoMultiplicavel, jlDanoAdicional, jlFn,  jlPesoMultiplicador;
    
    public MaterialCadastro(){
        preencherConteudo();
        iniciarModoCadastro();
    } 
    
    public MaterialCadastro(int idMaterialParaEdicao){
        preencherConteudo();
        prepararParaEdicao(idMaterialParaEdicao);
        iniciarModoAlteracao();
    }
    
    @Override
    public void preencherConteudo(){
        Dimension grande = new Dimension(200, 28);
        Dimension pequeno = new Dimension(60, 28);
        
        resetarTituloIcone(
                "Cadastrar Material"
               ,"/assets/images/submenu/icons8-medieval-20(1).png");

        jtfId.setPreferredSize(pequeno);       
        jtfNome.setPreferredSize(grande);
        
        jlCusto = new JLabel("Custo (*)");       
        jtfCusto = new JTextField();
        jtfCusto.setPreferredSize(pequeno);
        
        jlDanoMultiplicavel = new JLabel("Dano (*)");       
        jtfDanoMultiplicavel = new JTextField();
        jtfDanoMultiplicavel.setPreferredSize(pequeno);
        
        jlDanoAdicional = new JLabel("Dano (+)");       
        jtfDanoAdicional = new JTextField();
        jtfDanoAdicional.setPreferredSize(pequeno);
        
        jlFn = new JLabel("Fn (+)");       
        jtfFn = new JTextField();
        jtfFn.setPreferredSize(pequeno);
        
        jlPesoMultiplicador = new JLabel("Peso (*)");       
        jtfPesoMultiplicador = new JTextField();
        jtfPesoMultiplicador.setPreferredSize(pequeno);
        
        jpCamposDeFiltro.add(jlCusto);
        jpCamposDeFiltro.add(jtfCusto);
        
        jpCamposDeFiltro.add(jlDanoMultiplicavel);
        jpCamposDeFiltro.add(jtfDanoMultiplicavel);
        
        jpCamposDeFiltro.add(jlDanoAdicional);
        jpCamposDeFiltro.add(jtfDanoAdicional);
        
        jpCamposDeFiltro.add(jlFn);
        jpCamposDeFiltro.add(jtfFn);
        
        jpCamposDeFiltro.add(jlPesoMultiplicador);
        jpCamposDeFiltro.add(jtfPesoMultiplicador);
  
        jpCamposDeFiltro.setPreferredSize(new Dimension(jpCamposDeFiltro.getWidth(), jpCamposDeFiltro.getHeight()+50));
        
        habilitarCampos(false);
    }
    
    @Override
    public void prepararParaEdicao(int idMaterialParaEdicao){
               
        try { 
            MaterialController controller = new MaterialController();
            ArrayList<JTextField> camposParaEditar = new ArrayList<>();
            camposParaEditar.add(jtfId);
            camposParaEditar.add(jtfNome);
            camposParaEditar.add(jtfCusto);
            camposParaEditar.add(jtfDanoMultiplicavel);
            camposParaEditar.add(jtfDanoAdicional);
            camposParaEditar.add(jtfFn);
            camposParaEditar.add(jtfPesoMultiplicador);
            
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
        jtfCusto.setEnabled(logica);
        jtfDanoMultiplicavel.setEnabled(logica);
        jtfDanoAdicional.setEnabled(logica);
        jtfFn.setEnabled(logica);
        jtfPesoMultiplicador.setEnabled(logica);   
    }
    
    @Override
    public void limparCampos() {
        jtfId.setText("");
        jtfNome.setText("");
        jtfCusto.setText("");
        jtfDanoMultiplicavel.setText("");
        jtfDanoAdicional.setText("");
        jtfFn.setText("");
        jtfPesoMultiplicador.setText("");   
    }
        
    @Override
    public void salvarRegistro(){
        
        try{
            MaterialController controller = new MaterialController();
                        
            if (getModo().equals("Alt") ){
                controller.alterar(
                    jtfId.getText(),
                    jtfNome.getText(),
                    jtfCusto.getText(),
                    jtfDanoMultiplicavel.getText(),
                    jtfDanoAdicional.getText(),
                    jtfFn.getText(),
                    jtfPesoMultiplicador.getText());
                
                JOptionPane.showMessageDialog(null, "Material Alterado Com Sucesso", "Sucesso ao Alterar Material", JOptionPane.INFORMATION_MESSAGE);
            }else{
                controller.inserir(
                    jtfNome.getText(),
                    jtfCusto.getText(),
                    jtfDanoMultiplicavel.getText(),
                    jtfDanoAdicional.getText(),
                    jtfFn.getText(),
                    jtfPesoMultiplicador.getText());
                
                JOptionPane.showMessageDialog(null, "Material Salvo Com Sucesso", "Sucesso ao Salvar Material", JOptionPane.INFORMATION_MESSAGE);
                limparCampos();
            }  
            
            habilitarCampos(false);
            resetCadastro();
            controller.carregarTudo( GerenciadorDeTelas.getArqMaterial().jtTabela );
            
        }catch(CamposInvalidosException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Algum dos campos inseridos está nulo ou é invalido","Campos inválidos!", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
            e.printStackTrace();
            ExceptionHandler.exibirExcecaoDialog(e);
        }
        
    }
    
    @Override
    public void deletarRegistro(){
        try {
                MaterialController controller = new MaterialController();
                controller.deletar( jtfId.getText() );
                GerenciadorDeTelas.removerCadMaterial( jtfId.getText() );
                
                JOptionPane.showMessageDialog(null, "Registro Deletado Com Sucesso", "Sucesso ao Deletar", JOptionPane.INFORMATION_MESSAGE);
                setVisible(false);
                setClosed(true);
        } catch (Exception e) {
            ExceptionHandler.exibirExcecaoDialog(e);
        }
    }
}