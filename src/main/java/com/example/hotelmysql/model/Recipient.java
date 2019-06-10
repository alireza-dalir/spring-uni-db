package com.example.hotelmysql.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

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

    public LocalDate getReceived() {
        return received;
    }

    public void setReceived(LocalDate received) {
        this.received = received;
    }

    public LocalDate getLeft() {
        return left;
    }

    public void setLeft(LocalDate left) {
        this.left = left;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
