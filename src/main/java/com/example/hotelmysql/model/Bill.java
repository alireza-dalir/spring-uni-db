package com.example.hotelmysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bill")
public class Bill extends BaseEntity {


    @Column(name = "payment")
    private int payment;

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }
}
