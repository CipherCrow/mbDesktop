package view.gui;

import controller.Controller;
import controller.MateriaisController;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CadastroMaterial extends ModeloCadastrar {
    
    public JTextField jtfCusto, jtfDanoMultiplicavel, jtfDanoAdicional, jtfFn, jtfPesoMultiplicador;
    public JLabel jlCusto, jlDanoMultiplicavel, jlDanoAdicional, jlFn,  jlPesoMultiplicador;
    
    public CadastroMaterial(){
      
        resetarTituloIcone(
                "Cadastrar Material"
               ,"/assets/images/submenu/icons8-medieval-20(1).png");
        
        jlCusto = new JLabel("Custo (*)");       
        jtfCusto = new JTextField();
        
        jlDanoMultiplicavel = new JLabel("Dano (*)");       
        jtfDanoMultiplicavel = new JTextField();
        
        jlDanoAdicional = new JLabel("Dano (+)");       
        jtfDanoAdicional = new JTextField();
        
        jlFn = new JLabel("Fn (+)");       
        jtfFn = new JTextField();
        
        jlPesoMultiplicador = new JLabel("Peso (*)");       
        jtfPesoMultiplicador = new JTextField();
        
        jpCamposDeFiltro.add(jlCusto).setBounds(215, 0, 50, 30);
        jpCamposDeFiltro.add(jtfCusto).setBounds(212, 30, 50, 28);
        
        jpCamposDeFiltro.add(jlDanoMultiplicavel).setBounds(270, 0, 50, 30);
        jpCamposDeFiltro.add(jtfDanoMultiplicavel).setBounds(267, 30, 50, 28);
        
        jpCamposDeFiltro.add(jlDanoAdicional).setBounds(325, 0, 50, 30);
        jpCamposDeFiltro.add(jtfDanoAdicional).setBounds(322, 30, 50, 28);
        
        jpCamposDeFiltro.add(jlFn).setBounds(380, 0, 50, 30);
        jpCamposDeFiltro.add(jtfFn).setBounds(377, 30, 50, 28);
        
        jpCamposDeFiltro.add(jlPesoMultiplicador).setBounds(435, 0, 50, 30);
        jpCamposDeFiltro.add(jtfPesoMultiplicador).setBounds(432, 30, 50, 28);
  
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
            JOptionPane.showMessageDialog(null, "Valor vazio ou inválido", "Erro ao Salvar", JOptionPane.ERROR_MESSAGE);
        }
        
    }
}