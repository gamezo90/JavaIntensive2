package task1;

public class User {

    int id;

    int age;

    String sourName;

    String name;

    public User(int id, int age, String sourName, String name) {
        this.id = id;
        this.age = age;
        this.sourName = sourName;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getSourName() {
        return sourName;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSourName(String sourName) {
        this.sourName = sourName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", sourName='" + sourName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
