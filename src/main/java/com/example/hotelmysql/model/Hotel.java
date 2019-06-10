package com.example.hotelmysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel  extends BaseEntity{

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "telephone")
    private Long telephone;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }
}
