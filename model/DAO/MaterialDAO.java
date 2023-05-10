package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;
import model.entities.MaterialItem;

public class MaterialDAO {
    private Connection conexao;
     
    public MaterialDAO(Connection conexao){
        this.conexao = conexao;
    }
     
    public void add(MaterialItem material){
        String query = "INSERT INTO material(nom_material, qtd_multCusto, qtd_multDano, qtd_modDano, qtd_modFn, qtd_multPeso) VALUES (?,?,?,?,?,?)";
        
        try( PreparedStatement sql = conexao.prepareStatement(query) ){
            sql.setString(1, material.getNome());
            sql.setDouble(2, material.getMultiplicadorDeCusto());
            sql.setDouble(3, material.getMultiplicadorDeDano());
            sql.setDouble(4, material.getModificadorDeDano());
            sql.setDouble(5, material.getModificadorDeFn());
            sql.setDouble(6, material.getMultiplicadorDePeso());
            
            sql.execute();
        }catch(Exception e){
            System.err.println("Erro ao tentar salvar material");
            throw new RuntimeException(e);
        }finally{
            try {
                conexao.close();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
         
    }
    
    public Set<MaterialItem> selectAll(){
        Set<MaterialItem> materiais = new HashSet<>();
        
        String query = "SELECT * FROM material";
        
        try( PreparedStatement sql = conexao.prepareStatement(query) ){            
            ResultSet rs = sql.getResultSet();
            
            while(rs.next()){
                int id = rs.getInt(1);
                String nome = rs.getString(2);
                Double multiplicadorDeCusto = rs.getDouble(3);
                Double multiplicadorDeDano = rs.getDouble(4);
                int modificadorDeDano = rs.getInt(5);
                int modificadorDeFn =  rs.getInt(6);
                Double multiplicadorDePeso =  rs.getDouble(7);
                
                materiais.add( new MaterialItem(id,nome,multiplicadorDeCusto,multiplicadorDeDano,modificadorDeDano,modificadorDeFn,multiplicadorDePeso) );
            }
            
        }catch(Exception e){
            System.err.println("Erro ao coletar todos os materiais!");
            throw new RuntimeException(e);
        }finally{
            try {
                conexao.close();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
        return materiais;
    }
     
}