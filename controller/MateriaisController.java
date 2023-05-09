package controller;

import java.util.ArrayList;
import javax.swing.JTable;
import model.entities.Configuracao;
import model.entities.Conteudo;
import model.entities.MaterialItem;

public class MateriaisController implements Controller {
    
    public void carregarMateriais(String[] colunas, JTable tabela) throws Exception{
        ArrayList<MaterialItem> materiaisCadastrados = Configuracao.coletarMateriais();
        
        if(materiaisCadastrados == null || materiaisCadastrados.size() == 0){
            throw new Exception("Não existe material cadastrado!");
        }
        
        tabela.setModel(
        new javax.swing.table.DefaultTableModel( 
            new Object [] [] { materiaisCadastrados.toArray() }
            ,colunas ));
         
    }   
    
    @Override
    public void inserir(String... campos) throws Exception {
        validarCampoNaoVazio(campos[0]);
        validarDecimal(campos[1]);
        validarDecimal(campos[2]);
        validarInteiro(campos[3]);
        validarInteiro(campos[4]);
        validarDecimal(campos[5]);

        MaterialItem material = new MaterialItem(
                campos[0],
                converteParaDouble(campos[1]),
                converteParaDouble(campos[2]),
                converteParaInt(campos[3]),
                converteParaInt(campos[4]),
                converteParaDouble(campos[5]));
        
        Conteudo homebrew = Configuracao.encontrarConteudo("Homebrews");
        homebrew.addMaterial(material);
        
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
    
    private Double converteParaDouble(String string){
        return Double.parseDouble(string);
    }
    
    private int converteParaInt(String string){
        return Integer.parseInt(string);
    }
        
    @Override
    public void deletar() {
        
    }

    @Override
    public void alterar(String... campos) {
        
    }

}