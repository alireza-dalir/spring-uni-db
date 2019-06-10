package com.example.hotelmysql.service.springDataJpa;

import com.example.hotelmysql.model.Room;
import com.example.hotelmysql.repository.RoomRepository;
import com.example.hotelmysql.service.RoomService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RoomSDJpaService implements RoomService {

    private final RoomRepository roomRepository;

    public RoomSDJpaService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public Set<Room> findAll() {
        Set<Room> rooms = new HashSet<>();
        roomRepository.findAll().forEach(rooms::add);
        return rooms;
    }

    @Override
    public Room findById(Long aLong) {
        return roomRepository.findById(aLong).orElse(null);
    }

    @Override
    public Room save(Room object) {
        return roomRepository.save(object);
    }

    @Override
    public void delete(Room room) {
        roomRepository.delete(room);
    }

    @Override
    public void deleteById(Long aLong) {
        roomRepository.deleteById(aLong);
    }
}
