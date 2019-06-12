package models

data class Station(
    val stationId: Int,
    val stationName: String,
    val stationState: String,
    val stationCounty: String,
    val stationCapacity: Int
)