package com.example.Traveltrek.model


import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.hateoas.RepresentationModel



import javax.validation.constraints.Email
import javax.validation.constraints.Pattern

@Document("Hotel")
data class Hotel (

    @Id
    var name:String,
    @get:Email(message="Invalid Email")
    var email:String,
    @get:Pattern(regexp = "^[0-9]{10}")
    var phone: String,
    var gender:String,
    var numberofadults:String,
    var adhar: String,
    var Checkindate:String,
    var Checkoutdate:String,
): RepresentationModel<Hotel>()