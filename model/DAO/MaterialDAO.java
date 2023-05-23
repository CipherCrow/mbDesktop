package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.entities.Material;

public class MaterialDAO implements DAO{
    private Connection conexao;
     
    public MaterialDAO(Connection conexao){
        this.conexao = conexao;
    }
    
    @Override
    public void add(Object objeto) throws SQLException{
        Material material = (Material)  objeto;
        String query = "INSERT INTO material(nom_material, qtd_multCusto, qtd_multDano, qtd_modDano, qtd_modFn, qtd_multPeso) VALUES (?,?,?,?,?,?)";
        
        try( PreparedStatement sql = conexao.prepareStatement(query) ){
            sql.setString(1, material.getNome());
            sql.setDouble(2, material.getMultiplicadorDeCusto());
            sql.setDouble(3, material.getMultiplicadorDeDano());
            sql.setDouble(4, material.getModificadorDeDano());
            sql.setDouble(5, material.getModificadorDeFn());
            sql.setDouble(6, material.getMultiplicadorDePeso());
            
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
    public ArrayList<Material> selectAll() throws Exception{
        ArrayList<Material> materiais = new ArrayList<>();
        
        String query = "SELECT * FROM material";
        
        try( PreparedStatement sql = conexao.prepareStatement(query) ){  
            ResultSet rs = sql.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt(1);
                String nome = rs.getString(2);
                Double multiplicadorDeCusto = rs.getDouble(3);
                Double multiplicadorDeDano = rs.getDouble(4);
                int modificadorDeDano = rs.getInt(5);
                int modificadorDeFn =  rs.getInt(6);
                Double multiplicadorDePeso =  rs.getDouble(7);
                
                materiais.add(new Material(id,nome,multiplicadorDeCusto,multiplicadorDeDano,modificadorDeDano,modificadorDeFn,multiplicadorDePeso) );
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
        return materiais;
    }
    
    @Override
    public void update(Object objeto) throws SQLException{
        Material material = (Material)  objeto;
        String query = "UPDATE material SET"
                + " nom_material = (?)"
                + ", qtd_multCusto = (?)"
                + ", qtd_multDano = (?)"
                + ", qtd_modDano = (?)"
                + ", qtd_modFn = (?)"
                + ", qtd_multPeso = (?)"
                + " WHERE cod_material = (?)";
        
        try( PreparedStatement sql = conexao.prepareStatement(query) ){
            sql.setString(1, material.getNome());
            sql.setDouble(2, material.getMultiplicadorDeCusto());
            sql.setDouble(3, material.getMultiplicadorDeDano());
            sql.setDouble(4, material.getModificadorDeDano());
            sql.setDouble(5, material.getModificadorDeFn());
            sql.setDouble(6, material.getMultiplicadorDePeso());
            
            sql.setInt(7, material.getId());
            
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
        ArrayList<Material> materiais = new ArrayList();
        String nomeBuscado = String.format("%s", parametros[0]);
        String query = "SELECT * from material WHERE "
                + "nom_material LIKE ?";
        
        try( PreparedStatement sql = conexao.prepareStatement(query) ){
            
            sql.setString(1, "%"+nomeBuscado+"%");
            ResultSet rs = sql.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt(1);
                String nome = rs.getString(2);
                Double multiplicadorDeCusto = rs.getDouble(3);
                Double multiplicadorDeDano = rs.getDouble(4);
                int modificadorDeDano = rs.getInt(5);
                int modificadorDeFn =  rs.getInt(6);
                Double multiplicadorDePeso =  rs.getDouble(7);
                
                materiais.add(new Material(id,nome,multiplicadorDeCusto,multiplicadorDeDano,modificadorDeDano,modificadorDeFn,multiplicadorDePeso) );
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
        
        return materiais;
    }
    
    @Override
    public Object findByID(int idProcurado) throws Exception {
        Material material = null;
        
        String query = "SELECT * from material WHERE "
                + "cod_material = ?";
        
        try( PreparedStatement sql = conexao.prepareStatement(query) ){
            
            sql.setInt(1, idProcurado);
            ResultSet rs = sql.executeQuery();
            
            while(rs.next()){
                String nome = rs.getString(2);
                Double multiplicadorDeCusto = rs.getDouble(3);
                Double multiplicadorDeDano = rs.getDouble(4);
                int modificadorDeDano = rs.getInt(5);
                int modificadorDeFn =  rs.getInt(6);
                Double multiplicadorDePeso =  rs.getDouble(7);
                
                material = new Material(idProcurado,nome,multiplicadorDeCusto,multiplicadorDeDano,modificadorDeDano,modificadorDeFn,multiplicadorDePeso) ;
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
        
        return material;
    }

    @Override
    public void deleteByID(int idParaDelecao) throws Exception {
        String query = "DELETE FROM material WHERE cod_material = ?";
        
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