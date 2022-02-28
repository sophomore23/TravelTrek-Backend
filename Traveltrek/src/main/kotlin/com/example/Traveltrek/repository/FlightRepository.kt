package com.example.Traveltrek.repository

import com.example.Traveltrek.model.Flight

import org.springframework.data.mongodb.repository.MongoRepository


import org.springframework.stereotype.Repository

@Repository
interface FlightRepository: MongoRepository<Flight, String> {
}