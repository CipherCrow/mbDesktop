package controller;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.jdbc.ConnectionFactory;
import model.jdbc.TabelasEnum;

public class PopuladorDeBanco {
    private Connection con;
    
    public PopuladorDeBanco(){}
    
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
    }
    
    public void estruturarTabela(String sql){
        con = new ConnectionFactory().getConexao();
        try{
            Statement psmt = con.createStatement();
            psmt.execute(sql);
            psmt.close();
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
        finally{
            try {
                con.close();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        
        
    }
}