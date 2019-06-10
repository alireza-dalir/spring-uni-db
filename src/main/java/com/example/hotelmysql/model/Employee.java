package com.example.hotelmysql.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee extends Person {

    @OneToOne
    private Employee manager;

}
