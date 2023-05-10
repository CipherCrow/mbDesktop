package controller;

import exceptions.CamposInvalidosException;
import java.util.HashSet;
import javax.swing.JTable;
import model.DAO.MaterialDAO;
import model.entities.MaterialItem;
import model.jdbc.ConnectionFactory;

public class MateriaisController implements Controller {
    
    public void carregarMateriais(String[] colunas, JTable tabela) throws Exception{
        MaterialDAO materialDAO = new MaterialDAO(new ConnectionFactory().getConexao());
        
        HashSet<MaterialItem> materiaisCadastrados = (HashSet) materialDAO.selectAll();
        
//        //velho
//        ArrayList<MaterialItem> materiaisCadastrados = Configuracao.coletarMateriais();
//        
//        if(materiaisCadastrados == null || materiaisCadastrados.size() == 0){
//            throw new Exception("Não existe material cadastrado!");
//        }
        
        tabela.setModel(
        new javax.swing.table.DefaultTableModel( 
            new Object [] [] { materiaisCadastrados.toArray() }
            ,colunas ));
         
    }   
    
    @Override
    public void inserir(String... campos) throws Exception {
        realizarValidacoesDosCampos(campos);

        MaterialItem material = new MaterialItem();
        
        material.setNome(campos[0]);
        material.setMultiplicadorDeCusto(converteParaDouble(campos[1]));
        material.setMultiplicadorDeDano(converteParaDouble(campos[2]));
        material.setModificadorDeDano(converteParaInt(campos[3]));
        material.setModificadorDeFn(converteParaInt(campos[4]));
        material.setMultiplicadorDePeso(converteParaDouble(campos[5]));
        
        new MaterialDAO( new ConnectionFactory().getConexao() ).add(material);     
    }
    
    @Override
    public void alterar(String... campos) throws Exception {
        realizarValidacoesDosCampos(campos);
        
        MaterialItem material = new MaterialItem();
        
        material.setId(converteParaInt(campos[0]));
        material.setNome(campos[1]);
        material.setMultiplicadorDeCusto(converteParaDouble(campos[2]));
        material.setMultiplicadorDeDano(converteParaDouble(campos[3]));
        material.setModificadorDeDano(converteParaInt(campos[4]));
        material.setModificadorDeFn(converteParaInt(campos[5]));
        material.setMultiplicadorDePeso(converteParaDouble(campos[6]));
        
        new MaterialDAO( new ConnectionFactory().getConexao() ).add(material); 
    }
    
    public void realizarValidacoesDosCampos(String... campos) throws Exception{
        validarCampoNaoVazio(campos[0]);
        validarDecimal(campos[1]);
        validarDecimal(campos[2]);
        validarInteiro(campos[3]);
        validarInteiro(campos[4]);
        validarDecimal(campos[5]);
    }

    private void validarCampoNaoVazio(String campo) throws Exception {
        if (campo == null || campo.trim().isEmpty()) {
            throw new CamposInvalidosException("Não foi possível inserir o Material");
        }
    }
    //Verifica se é um campo de texto inteiro e não vazio
    private void validarInteiro(String campo) throws Exception {
                         //"^-?\\d+$";        
        if (!campo.matches("^-?\\d+$")) {
            throw new CamposInvalidosException("Não foi possível inserir o Material");
        }
    }
    
    //Verifica se um campo de texto não está vazio e se um número inserido não contém caracteres especiais (exceto o ponto decimal) e não é um número negativo.
    private void validarDecimal(String campo) throws Exception {          
                         //"^(?=\\S)([+-]?([0-9]*[.])?[0-9]+)?$";
        if (!campo.matches("^(?=\\S)([+-]?([0-9]*[.])?[0-9]+)?$")) {
            throw new CamposInvalidosException("Não foi possível inserir o Material");
        }
    }
    
    private Double converteParaDouble(String string){
        return Double.parseDouble(string);
    }
    
    private int converteParaInt(String string){
        return Integer.parseInt(string);
    }
        
    @Override
    public void deletar() {
        
    }

}