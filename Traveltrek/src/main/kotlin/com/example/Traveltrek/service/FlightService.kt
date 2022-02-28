package com.example.Traveltrek.service

import com.example.Traveltrek.model.Flight
import com.example.Traveltrek.repository.FlightRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class FlightService(@Autowired val flightRepository: FlightRepository) {
    fun add( flight: Flight): Flight {
        return flightRepository.save(flight)
    }
    fun retrieveAllDetails():List<Flight>{
        return flightRepository.findAll()
    }
}