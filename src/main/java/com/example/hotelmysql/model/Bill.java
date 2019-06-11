package com.example.hotelmysql.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "bill")
public class Bill extends BaseEntity {


    @Column(name = "payment")
    private int payment;

}
