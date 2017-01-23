import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * Created by Катя on 23.12.2016.
 */
public class AbstractDAOImpl<T> implements AbstractDAO<T> {
    public List<T> bdList = new ArrayList<>();


    @Override
    public T save(T t) {
        bdList.add(t);
        return t;
    }

    @Override
    public void delete(T t) {
        bdList.remove(t);

    }

    @Override
    public void deleteAll(List<T> list) {

        bdList.removeAll(list);

    }

    @Override
    public void saveAll(List<T> list) {
        bdList.addAll(list);
    }

    @Override
    public List<T> getList() {
        return bdList;
    }

    @Override
    public void deleteById(long id) {
        for (int i = 0; i < bdList.size(); i++) {
            if (User.getId() == id) {
                bdList.remove(i);
            }
        }
    }

    @Override
    public T get(long id) {
        T search = null;
        for (int i = 0; i < bdList.size(); i++) {
            if (User.getId() == id) {
                search = bdList.get(i);

            }

        }
if (search.equals(null)) return null;
        else return search;
    }
}

