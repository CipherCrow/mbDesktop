package model.DAO;

import java.util.Set;

public interface DAO {
    public void add(Object objeto);
    public Set<Object> selectAll();
    public void update(Object objeto);
    public void find();
}
