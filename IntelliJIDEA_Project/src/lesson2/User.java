package lesson2;

/**
 * Created by Clock on 2017/7/19.
 */
public class User {

    private int id;
    private String name;
    private int age;

    public User(int id) {
        this(id, "");
    }

    public User(int id, String name) {
        this(id, name, 0);
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
