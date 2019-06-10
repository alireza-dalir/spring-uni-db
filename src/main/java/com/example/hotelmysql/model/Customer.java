package com.example.hotelmysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "customer")
public class Customer extends Person {


    @Column(name = "personal_id" , nullable = false)
    private String pId;

    @OneToOne
    private Bill bill;

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

}
