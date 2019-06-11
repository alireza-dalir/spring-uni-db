package com.example.hotelmysql.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Setter
@Getter
@Entity
@Table(name = "test")
public class Test extends BaseEntity{

    @Column(name = "first_name",length = 100)
    private String fName;

    @Column(name = "last_name",length = 100)
    private String lName;

    @Column(name = "age")
    private int age = 18;


}
