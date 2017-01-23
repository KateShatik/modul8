/**
 * Created by Катя on 23.12.2016.
 */
import java.util.List;
import java.util.ArrayList;
public interface AbstractDAO<T> {

    public T save(T t);
    public void delete(T t);
    public void deleteAll(List<T> list);
    public void saveAll(List<T> list);
    public  List<T> getList();
    public void deleteById(long id);
    public  T get(long id);
}
