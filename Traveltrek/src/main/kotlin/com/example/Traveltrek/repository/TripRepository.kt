package com.example.Traveltrek.repository

import com.example.Traveltrek.model.Trip
//import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface TripRepository: MongoRepository<Trip, String> {
}