package employers;

import java.util.ArrayList;


public interface DAO<T> {

    public T get(T t);


    public ArrayList<T> getAll();

    public void delete(T t);

    public void add(T t);


}
