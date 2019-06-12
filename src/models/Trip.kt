package models

import java.util.Date

data class Trip(
    var tripState: String,
    var tripStartTime: Date,
    var tripExpectedArrivalTime: Date,
    var startPoint: String,
    var destination: String,
    var stations: ArrayList<Station>,
    var bus: String,
    var passengers: ArrayList<Passenger>,
    var driver: String
)