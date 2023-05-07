package view.gui;

import controller.Controller;
import controller.MateriaisController;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CadastroMaterial extends ModeloCadastrar {
    
    public JTextField jtfCusto, jtfDanoMultiplicavel, jtfDanoAdicional, jtfFn, jtfPesoMultiplicador;
    public JLabel jlCusto, jlDanoMultiplicavel, jlDanoAdicional, jlFn,  jlPesoMultiplicador;
    
    public CadastroMaterial(){
        Dimension grande = new Dimension(200, 28);
        Dimension pequeno = new Dimension(60, 28);
        
        resetarTituloIcone(
                "Cadastrar Material"
               ,"/assets/images/submenu/icons8-medieval-20(1).png");
        
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
  
        jpCamposDeFiltro.revalidate();
        jpCamposDeFiltro.repaint();
        
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
            Controller controller = new MateriaisController();
                        
            if (modo.equals("Alterar") ){
            
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
        }catch(Exception e){
            System.err.println( e.getMessage() );
            JOptionPane.showMessageDialog(null, "Existem campos vazios ou com caractéres inválidos!", "Erro ao Salvar", JOptionPane.ERROR_MESSAGE);
        }
        
    }
}