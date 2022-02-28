
package com.example.Traveltrek.model


import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.hateoas.RepresentationModel
import javax.validation.constraints.Email
import javax.validation.constraints.Pattern

@Document("Trip")
data class Trip (

    @Id
    var adhar: String,
    var name:String,
    @get:Email(message="Invalid Email")
    var email:String,
    @get:Pattern(regexp = "^[0-9]{10}")
    var phone: String



    ): RepresentationModel<Flight>()