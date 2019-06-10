package com.example.hotelmysql.repository;

import com.example.hotelmysql.model.Hotel;
import org.springframework.data.repository.CrudRepository;

public interface HotelRepository extends CrudRepository<Hotel,Long> {
}
