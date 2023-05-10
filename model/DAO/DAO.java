package model.DAO;

public interface DAO {
    public void add(Object objeto) throws Exception;
    public Object selectAll() throws Exception;
    public void update(Object objeto) throws Exception;
    public void find();
}
