package models;

public class User implements DTO {

    private Integer id;
    private String name;
    private String pwd;
    private Integer age;

// ---- constructors ---------------------
    public User() {
    }

    public User(String name, String pass, Integer age) {
        this.name = name;
        this.pwd = pass;
        this.age = age;
    }

    public User(Integer id, String name, String pass, Integer age) {
        this.id = id;
        this.name = name;
        this.pwd = pass;
        this.age = age;
    }

// --------- getters & setters -------------
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPass() {
        return pwd;
    }
    public void setPass(String pass) {
        this.pwd = pass;
    }


}
