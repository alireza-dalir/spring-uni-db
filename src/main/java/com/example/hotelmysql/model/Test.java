package com.example.hotelmysql.model;

import javax.persistence.*;


@Entity
@Table(name = "test")
public class Test extends BaseEntity{

    @Column(name = "first_name",length = 100)
    private String fName;

    @Column(name = "last_name",length = 100)
    private String lName;

    @Column(name = "age")
    private int age = 18;


    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
