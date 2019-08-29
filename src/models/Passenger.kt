package models

import java.lang.IllegalArgumentException

class Passenger{

    var passangerId:Int = 0

    set(value){
        field = if(passangerId is Int) value else
            throw IllegalArgumentException("Passanger Id must be Integer")
    }
    var name :String = ""
    get() {
        return name.toLowerCase().trim()
    }
    var age:Int = 0

    set(value){
        field = if(age is Int && age >17) value else
            throw IllegalArgumentException("Age should be int and above 17")
    }
    var passengerType:String = ""
    get() {
        return passengerType.toLowerCase()
    }
    var passengerTravelStatus:String = ""
    var passengerTravelClass:Int = 0
    set(value){
        field = if(passengerTravelClass is Int && passengerTravelClass >4 )value
        else throw IllegalArgumentException("Travel class should be int with 3 options")
    }

    var travelClass: String = ""
}
