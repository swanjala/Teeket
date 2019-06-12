package models

data class Passenger(
    var passengerId: Int,
    var name: String,
    var age: Int,
    var passengerType: String,
    var passengerTravelStatus: String,
    var passengerTravelClass: String,
    var travelClass: String
)
