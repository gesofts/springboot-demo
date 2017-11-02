package com.gesoft.domain;

/**
 * ClassName: User <br/>
 * Function: <br/>
 *
 * @author gary.liu
 * @date 2017/5/30
 */
public class User {

    public User()
    {

    }
    public User(Long id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Long id;

    public String name;

    public int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
