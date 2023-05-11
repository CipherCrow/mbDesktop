package view.gui;

import controller.Controller;
import model.table.TableEnum;
import controller.GerenciadorDeTelas;
import controller.MateriaisController;
import exceptions.CamposInvalidosException;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MaterialCadastro extends ModeloCadastrar {
    
    public JTextField jtfCusto, jtfDanoMultiplicavel, jtfDanoAdicional, jtfFn, jtfPesoMultiplicador;
    public JLabel jlCusto, jlDanoMultiplicavel, jlDanoAdicional, jlFn,  jlPesoMultiplicador;
    
    public MaterialCadastro(){
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
    public void salvarMaterial(String modo){
        
        try{
            MateriaisController controller = new MateriaisController();
                        
            if (modo.equals("Alterar") ){
                
                controller.alterar(
                    jtfId.getText(),
                    jtfNome.getText(),
                    jtfCusto.getText(),
                    jtfDanoMultiplicavel.getText(),
                    jtfDanoAdicional.getText(),
                    jtfFn.getText(),
                    jtfPesoMultiplicador.getText());
                
            }else{
                controller.inserir(
                    jtfNome.getText(),
                    jtfCusto.getText(),
                    jtfDanoMultiplicavel.getText(),
                    jtfDanoAdicional.getText(),
                    jtfFn.getText(),
                    jtfPesoMultiplicador.getText());
            }

            
            limparCampos();
            JOptionPane.showMessageDialog(null, "Material Salvo Com Sucesso", "Sucesso ao Salvar Material", JOptionPane.INFORMATION_MESSAGE);
            habilitarCampos(false);
            resetCadastro();
            
            //controller.carregarMateriais(TableEnum.Material.getCamposTabela(), GerenciadorDeTelas.getArqMaterial().jtTabela);
            
        }catch(CamposInvalidosException e){
            JOptionPane.showMessageDialog(null, "Existem campos vazios ou com caractéres inválidos!", "Erro ao Salvar: " + e, JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
            System.err.println( e.getMessage() );
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro ao Salvar: " + e , JOptionPane.ERROR_MESSAGE);
        }
        
    }
}