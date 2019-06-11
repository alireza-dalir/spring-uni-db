package com.example.hotelmysql.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Setter
@Getter
@Entity
@Table(name = "customer")
public class Customer extends Person {


    @Column(name = "personal_id" , nullable = false)
    private String pId;

    @OneToOne
    private Bill bill;

}
