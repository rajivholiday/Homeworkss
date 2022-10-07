package happyfamily6;
import java.util.List;

public interface FamilyDao<T> {
    public List<T> getAll();

    public T get(T t);

    public void delete(T t);

    public void add(T t);


}
