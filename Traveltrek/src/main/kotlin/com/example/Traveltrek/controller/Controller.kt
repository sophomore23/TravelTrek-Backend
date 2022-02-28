package com.example.Traveltrek.controller

import com.example.Traveltrek.model.*
import com.example.Traveltrek.service.*

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import javax.validation.Valid


@RestController
@CrossOrigin(origins = arrayOf("*"), allowedHeaders = arrayOf("*"))
class Controller(@Autowired val flightService: FlightService, @Autowired val hotelService: HotelService, @Autowired val tripService: TripService) {

    @GetMapping("/flight")
    fun getFlight():List<Flight>{
        return flightService.retrieveAllDetails()
    }
    @PostMapping("/flightdetails")
    fun addFlight(@Valid @RequestBody flight: Flight):Flight{
        return flightService.add(flight)
    }
    @GetMapping("/bookingdetails")
    fun bookingDetails():List<Hotel>{
        return hotelService.retrieveAllDetails()
    }

    @PostMapping("/hotelbooking")
    fun addHotel(@Valid @RequestBody hotel: Hotel): Hotel {
        return hotelService.add(hotel)
    }
    @GetMapping("/trip")
    fun getTripdetails():List<Trip>{
        return tripService.retrieveAllDetails()
    }
    @PostMapping("/bookingtrip")
    fun addTrip(@Valid @RequestBody trip: Trip): Trip {
        return tripService.add(trip)
    }
}