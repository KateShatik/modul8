import java.util.Iterator;
import java.util.List;

/**
 * Created by Катя on 24.12.2016.
 */
public class UserDAO<User> extends AbstractDAOImpl<User> {
    @Override
    public User save(User t) {
        bdList.add(t);
        return t;
    }

    @Override
    public void delete(User t) {
        bdList.remove(t);

    }

    @Override
    public void deleteAll(List<User> list) {

            bdList.removeAll(list);

    }

    @Override
    public void saveAll(List<User> list) {
        bdList.addAll(list);
    }

    @Override
    public List<User> getList() {
        return bdList;
    }

    @Override
    public void deleteById(long id) {

        for(int i=0; i<bdList.size(); i++) {
            if (User.getId().equals(id)) {
                bdList.remove(i);
            }
        }
    }

    @Override
    public User get(long id) {
         User search = new User();
        for(int i=0; i<bdList.size(); i++) {
            if (User.getId() == id) {
                search=bdList.get(i);
            }
        }
        return search;
    }


}
