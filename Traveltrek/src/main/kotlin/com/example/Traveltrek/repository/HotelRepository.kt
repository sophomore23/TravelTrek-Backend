package com.example.Traveltrek.repository

import com.example.Traveltrek.model.Hotel
//import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.mongodb.repository.MongoRepository

import org.springframework.stereotype.Repository

@Repository

interface HotelRepository : MongoRepository<Hotel, String> {
}