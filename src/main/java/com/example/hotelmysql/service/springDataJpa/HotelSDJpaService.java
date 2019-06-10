package com.example.hotelmysql.service.springDataJpa;

import com.example.hotelmysql.model.Hotel;
import com.example.hotelmysql.repository.HotelRepository;
import com.example.hotelmysql.service.HotelService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class HotelSDJpaService implements HotelService {

    private final HotelRepository hotelRepository;

    public HotelSDJpaService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public Set<Hotel> findAll() {
        Set<Hotel> hotels = new HashSet<>();
        hotelRepository.findAll().forEach(hotels::add);
        return hotels;
    }

    @Override
    public Hotel findById(Long aLong) {
        return hotelRepository.findById(aLong).orElse(null);
    }

    @Override
    public Hotel save(Hotel object) {
        return hotelRepository.save(object);
    }

    @Override
    public void delete(Hotel hotel) {
        hotelRepository.delete(hotel);
    }

    @Override
    public void deleteById(Long aLong) {
        hotelRepository.deleteById(aLong);
    }
}
