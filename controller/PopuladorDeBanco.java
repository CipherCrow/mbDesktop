package controller;

import java.io.File;
import java.sql.Connection;
import java.sql.Statement;
import model.jdbc.ConnectionFactory;
import model.jdbc.TabelasEnum;
import view.gui.ExceptionHandler;

public class PopuladorDeBanco {
    private Connection con;
    
    public PopuladorDeBanco() throws ClassNotFoundException{
        Class.forName("org.h2.Driver");
    }
    
    public boolean criaOBanco() throws Exception{
        if(seExisteBanco()){
            return true;
        }
        criaTabelas();
        return false;
    }
    
    private boolean seExisteBanco(){
        
        String homeDir = System.getProperty("user.home");
        String docsDir = homeDir + "/Documents/Banco de Fichas";
        
        File docsFolder = new File(docsDir);
        if (docsFolder.exists()) {
            return true;
        }
        return false;
        
    }
    
    public void criaTabelas() throws Exception{
        estruturarTabela(TabelasEnum.Material.getSqlCriacao());
        estruturarTabela(TabelasEnum.Idioma.getSqlCriacao());
    }
    
    public void estruturarTabela(String sql){
        con = new ConnectionFactory().getConexao();
        try{
            Statement psmt = con.createStatement();
            psmt.execute(sql);
            psmt.close();
        } catch(Exception e){
            e.printStackTrace();
            ExceptionHandler.exibirExcecaoDialog(e);
        }
        finally{
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
                ExceptionHandler.exibirExcecaoDialog(e);
            }
        }  
    }
}