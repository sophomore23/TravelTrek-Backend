package com.example.Traveltrek.model



import com.example.Traveltrek.repository.TripRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class TripService(@Autowired val tripRepository: TripRepository) {


    fun add( trip: Trip): Trip{
        return tripRepository.save(trip)
    }
    fun retrieveAllDetails():List<Trip>{
        return tripRepository.findAll()
    }


}