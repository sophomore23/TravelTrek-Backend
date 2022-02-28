package com.example.Traveltrek.model


import com.example.Traveltrek.repository.HotelRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class HotelService(@Autowired val hotelRepository: HotelRepository) {


    fun add( hotel: Hotel): Hotel{
        return hotelRepository.save(hotel)
    }
    fun retrieveAllDetails():List<Hotel>{
        return hotelRepository.findAll()
    }


}