/**
 * Created by Катя on 24.12.2016.
 */
public class User {
    private static long id;
    private String name;

    public static long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
    }
}
