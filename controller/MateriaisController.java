package controller;

import java.util.ArrayList;
import javax.swing.JTable;
import model.entities.Configuracao;
import model.entities.MaterialItem;

public class MateriaisController implements Controller {
 
    public void carregarMateriais(String[] colunas, JTable tabela) throws Exception{
        ArrayList<MaterialItem> materiaisCadastrados = Configuracao.coletarMateriais();
        
        if(materiaisCadastrados == null){
            throw new Exception("Não existe material cadastrado!");
        }
        
        tabela.setModel(
        new javax.swing.table.DefaultTableModel( 
            new Object [] [] { materiaisCadastrados.toArray() }
            ,colunas ));
         
    }   
    
//    CORRAM PARA AS COLINAS SOCORRO
//    @Override
//    public void inserir(String... campos) throws Exception{
//        //Expressão regular que verifica se o campo é inteiro(positivo ou negativo) e não vazio
//        String regex = "^\\s*-?\\d+\\s*$";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(campos[0]);
//        
//        //valida se batem
//        if(matcher.matches()){
//            
//            //Verifica se um campo de texto não está vazio e se um número inserido não contém caracteres especiais (exceto o ponto decimal) e não é um número negativo.
//            regex = "^(?=\\S)([+-]?([0-9]*[.])?[0-9]+)?$";
//            pattern = Pattern.compile(regex);
//            matcher = pattern.matcher(campos[1]);
//            
//            if(matcher.matches()){
//                
//                //Usa-se a mesma validação do regex anterior
//                matcher = pattern.matcher(campos[2]);
//                
//                if(matcher.matches()){
//                    
//                    //Verifica se é um campo de texto inteiro e não vazio
//                    regex = "^-?\\d+$";
//                    matcher = pattern.matcher(campos[3]);
//                    
//                    if(matcher.matches()){
//                        
//                        //usa-se a mesma validação do regex anterior
//                        matcher = pattern.matcher(campos[4]);
//                         if(matcher.matches()){
//                             
//                            //Verifica se um campo de texto não está vazio e se um número inserido não contém caracteres especiais (exceto o ponto decimal) e não é um número negativo.
//                            regex = "^(?=\\S)([+-]?([0-9]*[.])?[0-9]+)?$";
//                            pattern = Pattern.compile(regex);
//                            matcher = pattern.matcher(campos[5]);
//                            if(matcher.matches()){
//                                Configuracao.addConteudo("conteudo");
//                            }else{
//                                throw new Exception("Não foi possível inserir o Material"); 
//                             }
//                         }
//                         else{
//                            throw new Exception("Não foi possível inserir o Material"); 
//                         }
//                    }
//                    else{
//                        throw new Exception("Não foi possível inserir o Material"); 
//                    }
//                }
//                else{
//                    throw new Exception("Não foi possível inserir o Material"); 
//            }
//            }else
//            {
//                throw new Exception("Não foi possível inserir o Material"); 
//            }
//        }
//        else{
//           throw new Exception("Não foi possível inserir o Material"); 
//        }
//        
//        
//    }
    
    @Override
    public void inserir(String... campos) throws Exception {
        validarCampoNaoVazio(campos[0]);
        validarDecimal(campos[1]);
        validarDecimal(campos[2]);
        validarInteiro(campos[3]);
        validarInteiro(campos[4]);
        validarDecimal(campos[5]);

        //Configuracao.addConteudo("conteudo");
    }

    private void validarCampoNaoVazio(String campo) throws Exception {
        if (campo == null || campo.trim().isEmpty()) {
            throw new Exception("Não foi possível inserir o Material");
        }
    }
    //Verifica se é um campo de texto inteiro e não vazio
    private void validarInteiro(String campo) throws Exception {
                         //"^-?\\d+$";        
        if (!campo.matches("^-?\\d+$")) {
            throw new Exception("Não foi possível inserir o Material");
        }
    }
    
    //Verifica se um campo de texto não está vazio e se um número inserido não contém caracteres especiais (exceto o ponto decimal) e não é um número negativo.
    private void validarDecimal(String campo) throws Exception {          
                         //"^(?=\\S)([+-]?([0-9]*[.])?[0-9]+)?$";
        if (!campo.matches("^(?=\\S)([+-]?([0-9]*[.])?[0-9]+)?$")) {
            throw new Exception("Não foi possível inserir o Material");
        }
    }
        
    @Override
    public void deletar() {
        
    }

    @Override
    public void alterar(String... campos) {
        
    }

}