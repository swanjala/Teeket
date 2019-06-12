package models

/*Class that holds the bus entity data */
data class Bus(var busId:Int,
               var busName:String,
               var busCapacity:Int,
               var busLaggageCapacity:Int,
               var busRouteCode:Int)