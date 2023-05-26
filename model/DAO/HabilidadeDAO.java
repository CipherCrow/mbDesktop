package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.entities.Habilidade;

public class HabilidadeDAO implements DAO{
    private Connection conexao;
     
    public HabilidadeDAO(Connection conexao){
        this.conexao = conexao;
    }
    
    @Override
    public void add(Object objeto) throws SQLException{
        Habilidade habilidade = (Habilidade)  objeto;
        String query = "INSERT INTO habilidade(nom_habilidade, nom_habilidadeDeReferencia) VALUES (?,?)";
        
        try( PreparedStatement sql = conexao.prepareStatement(query) ){
            sql.setString(1, habilidade.getNome());
            sql.setString(2, habilidade.getHabilidadeDeReferencia());
            
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
    public ArrayList<Habilidade> selectAll() throws Exception{
        ArrayList<Habilidade> habilidades = new ArrayList<>();
        
        String query = "SELECT * FROM habilidade";
        
        try( PreparedStatement sql = conexao.prepareStatement(query) ){  
            ResultSet rs = sql.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt(1);
                String nome = rs.getString(2);
                String habilidadeReferencia = rs.getString(3);
                
                habilidades.add(new Habilidade(id,nome,habilidadeReferencia));
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
        return habilidades;
    }
    
    @Override
    public void update(Object objeto) throws SQLException{
        Habilidade habilidade = (Habilidade)  objeto;
        String query = "UPDATE habilidade SET"
                + " nom_habilidade = (?)"
                + ", nom_habilidadeDeReferencia = (?)"
                + " WHERE cod_habilidade = (?)";
        
        try( PreparedStatement sql = conexao.prepareStatement(query) ){
            sql.setString(1, habilidade.getNome());
            sql.setString(2, habilidade.getHabilidadeDeReferencia());
            sql.setInt(3, habilidade.getId());
            
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
        ArrayList<Habilidade> habilidades = new ArrayList();
        String nomeBuscado = String.format("%s", parametros[0]);
        String query = "SELECT * from habilidade WHERE "
                + "nom_habilidade LIKE ?";
        
        try( PreparedStatement sql = conexao.prepareStatement(query) ){
            
            sql.setString(1, "%"+nomeBuscado+"%");
            ResultSet rs = sql.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt(1);
                String nome = rs.getString(2);
                String habilidadeReferencia = rs.getString(3);
                
                habilidades.add(new Habilidade(id, nome, habilidadeReferencia) );
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
        
        return habilidades;
    }
    
    @Override
    public Object findByID(int idProcurado) throws Exception {
        Habilidade habilidade = null;
        
        String query = "SELECT * from habilidade WHERE "
                + "cod_habilidade = ?";
        
        try( PreparedStatement sql = conexao.prepareStatement(query) ){
            
            sql.setInt(1, idProcurado);
            ResultSet rs = sql.executeQuery();
            
            while(rs.next()){
                String nome = rs.getString(2);
                String habilidadeReferencia = rs.getString(3);
                
                habilidade = new Habilidade(idProcurado,nome,habilidadeReferencia) ;
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
        
        return habilidade;
    }

    @Override
    public void deleteByID(int idParaDelecao) throws Exception {
        String query = "DELETE FROM habilidade WHERE cod_habilidade = ?";
        
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