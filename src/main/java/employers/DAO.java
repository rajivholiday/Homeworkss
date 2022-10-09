package employers;

import java.sql.SQLException;
import java.util.List;


public interface DAO<T> {

    public T get(T t);

    public List<T> getAll();

    public void delete(T t);

    public void add(T t);


}
