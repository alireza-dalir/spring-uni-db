package com.example.hotelmysql.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "recipient")
public class Recipient extends BaseEntity {

    @Column(name = "date_received")
    private LocalDate received;

    @Column(name = "date_left")
    private LocalDate left;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "recipient")
    private Set<Room> rooms = new HashSet<>();

    @OneToOne
    private Customer customer;

}
