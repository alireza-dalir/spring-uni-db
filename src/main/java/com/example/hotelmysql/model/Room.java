package com.example.hotelmysql.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "room")
public class Room extends BaseEntity {

    @Column(name = "room_num")
    private int roomNum;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "capacity")
    private int capacity;

    @Lob
    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "recipient_id")
    private Recipient recipient;

}
