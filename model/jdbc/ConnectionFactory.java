package model.jdbc;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    public ConnectionFactory(){}
    
    public Connection getConexao(){
        Connection conexao = null;
        String url = "jdbc:h2:" + criaPastaPadraoBanco() + "/ArquivosDeSarfion";
            
        try {
            conexao = DriverManager.getConnection(url);
            conexao.setAutoCommit(false);
        } catch (SQLException ex) {
            System.err.println("Não foi possível conectar ao banco!");
        }
          
        return conexao;
    }
    
    private String criaPastaPadraoBanco(){
        String homeDir = System.getProperty("user.home");
        String docsDir = homeDir + "/Documents/Banco de Fichas";
        
        File docsFolder = new File(docsDir);
        if (!docsFolder.exists()) {
            docsFolder.mkdir();
        }
        return docsDir;
    }
}