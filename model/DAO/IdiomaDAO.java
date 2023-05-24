package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.entities.Idioma;

public class IdiomaDAO implements DAO{
    private Connection conexao;
     
    public IdiomaDAO(Connection conexao){
        this.conexao = conexao;
    }
    
    @Override
    public void add(Object objeto) throws SQLException{
        Idioma idioma = (Idioma)  objeto;
        String query = "INSERT INTO idioma(nom_idioma, nom_idiomaDeReferencia) VALUES (?,?)";
        
        try( PreparedStatement sql = conexao.prepareStatement(query) ){
            sql.setString(1, idioma.getNome());
            sql.setString(2, idioma.getIdiomaDeReferencia());
            
            sql.execute();
        }catch(SQLException e){
            conexao.rollback();
            throw e;

        }finally{
            try {
                conexao.commit();
                conexao.close();
            } catch (SQLException e) {
                throw e;
            }
        }
         
    }
    
    @Override
    public ArrayList<Idioma> selectAll() throws Exception{
        ArrayList<Idioma> idiomas = new ArrayList<>();
        
        String query = "SELECT * FROM idioma";
        
        try( PreparedStatement sql = conexao.prepareStatement(query) ){  
            ResultSet rs = sql.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt(1);
                String nome = rs.getString(2);
                String idiomaReferencia = rs.getString(3);
                
                idiomas.add(new Idioma(id,nome,idiomaReferencia));
            }
            
        }catch(SQLException e){
            conexao.rollback();
            
            throw e;
        }finally{
            try {
                conexao.commit();
                conexao.close();
            } catch (SQLException e) {
                throw e;
            }
        }
        return idiomas;
    }
    
    @Override
    public void update(Object objeto) throws SQLException{
        Idioma idioma = (Idioma)  objeto;
        String query = "UPDATE idioma SET"
                + " nom_idioma = (?)"
                + ", nom_idiomaDeReferencia = (?)"
                + " WHERE cod_idioma = (?)";
        
        try( PreparedStatement sql = conexao.prepareStatement(query) ){
            sql.setString(1, idioma.getNome());
            sql.setString(2, idioma.getIdiomaDeReferencia());
            sql.setInt(3, idioma.getId());
            
            sql.execute();
        }catch(Exception e){
            conexao.rollback();            
            throw e;

        }finally{
            try {
                conexao.commit();
                conexao.close();
            } catch (SQLException e) {
                throw e;
            }
        }
    }

    @Override
    public Object findByName(Object... parametros) throws Exception {
        ArrayList<Idioma> idiomas = new ArrayList();
        String nomeBuscado = String.format("%s", parametros[0]);
        String query = "SELECT * from idioma WHERE "
                + "nom_idioma LIKE ?";
        
        try( PreparedStatement sql = conexao.prepareStatement(query) ){
            
            sql.setString(1, "%"+nomeBuscado+"%");
            ResultSet rs = sql.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt(1);
                String nome = rs.getString(2);
                String idiomaReferencia = rs.getString(3);
                
                idiomas.add(new Idioma(id, nome, idiomaReferencia) );
                System.out.println(rs);
            }
            
        }catch(Exception e){
            conexao.rollback();            
            throw e;

        }finally{
            try {
                conexao.commit();
                conexao.close();
            } catch (SQLException e) {
                throw e;
            }
        }
        
        return idiomas;
    }
    
    @Override
    public Object findByID(int idProcurado) throws Exception {
        Idioma idioma = null;
        
        String query = "SELECT * from idioma WHERE "
                + "cod_idioma = ?";
        
        try( PreparedStatement sql = conexao.prepareStatement(query) ){
            
            sql.setInt(1, idProcurado);
            ResultSet rs = sql.executeQuery();
            
            while(rs.next()){
                String nome = rs.getString(2);
                String idiomaReferencia = rs.getString(3);
                
                idioma = new Idioma(idProcurado,nome,idiomaReferencia) ;
                System.out.println(rs);
            }
            
        }catch(Exception e){
            conexao.rollback();            
            throw e;

        }finally{
            try {
                conexao.commit();
                conexao.close();
            } catch (SQLException e) {
                throw e;
            }
        }
        
        return idioma;
    }

    @Override
    public void deleteByID(int idParaDelecao) throws Exception {
        String query = "DELETE FROM idioma WHERE cod_idioma = ?";
        
        try( PreparedStatement sql = conexao.prepareStatement(query) ){
            
            sql.setInt(1, idParaDelecao );
            sql.execute();
            
        }catch(Exception e){
            conexao.rollback();            
            throw e;

        }finally{
            try {
                conexao.commit();
                conexao.close();
            } catch (SQLException e) {
                throw e;
            }
        }
    }
}