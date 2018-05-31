package entity;

/**
 * Created by lvdia on 2018/5/26.
 */
public class User {
    private Integer id;
    private String username;
    private String age;
    private String gender;
    private String password;
    private  Address address;

    public User() {
    }

    public User(Integer id, String username, String age, String gender, String password, Address address) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.gender = gender;
        this.password = password;
        this.address = address;
    }

    public User(String username, String age, String gender, String password, Address address) {
        this.username = username;
        this.age = age;
        this.gender = gender;
        this.password = password;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", password='" + password + '\'' +
                ", address=" + address +
                '}';
    }
}
