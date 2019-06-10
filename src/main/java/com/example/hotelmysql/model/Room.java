package com.example.hotelmysql.model;

import javax.persistence.*;

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

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
