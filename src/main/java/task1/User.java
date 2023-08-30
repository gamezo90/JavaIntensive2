package task1;

import java.util.ArrayList;
import java.util.Collection;

public class User  {

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

    public ArrayList<User> creatUser(int id, int age, String sourName,String name){
        ArrayList<User> users = new ArrayList<>();
        User user = new User(1,22,"Prigozhin","Eugene");
        users.add(user);
        User user1 = new User(2,23,"WADHd","wadwad");
        users.add(user1);
        User user2 = new User(3,55,"wadawd","wadawd");
        users.add(user2);
        User user3 = new User(4, 56,"wdad","wadawd");
        users.add(user3);
        User user4 = new User(5,66,"wadd","wadawd");
        users.add(user4);
        return users;
    }
}
