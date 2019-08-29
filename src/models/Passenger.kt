package models

import java.lang.IllegalArgumentException

class Passenger{

    var passangerId:Int = 0

    set(value){
        field = if( value > 0) value else
            throw IllegalArgumentException("Passanger Id should be greater than 0")
    }
    var name :String = ""
    get() {
        return name.toLowerCase().trim()
    }
    var age:Int = 0

    set(value){
        field = if(value > 17) value else
            throw IllegalArgumentException("Age should be int and above 17")
    }
    var passengerType:String = ""
    get() {
        return passengerType.toLowerCase()
    }
    var passengerTravelStatus:String = ""
    var passengerTravelClass:Int = 0
    set(value){
        field = if(value >4 )value
        else throw IllegalArgumentException("Travel class should be int with 3 options")
    }

    var travelClass: String = ""
}
