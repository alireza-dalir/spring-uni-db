package com.example.hotelmysql.repository;

import com.example.hotelmysql.model.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room,Long> {
}
