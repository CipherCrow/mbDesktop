package model.DAO;

public interface DAO {
    public void add(Object objeto) throws Exception;
    public Object selectAll() throws Exception;
    public void update(Object objeto) throws Exception;
    public Object findByName(Object... parametros) throws Exception;
    public Object findByID(int idProcurado) throws Exception;
    public void deleteByID(int idParaDelecao)throws Exception;
}
