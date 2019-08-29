package models

import java.lang.IllegalArgumentException

class Driver{
    var driverId:Int = 0

    set(value){
        field = if (value >  0) value else
            throw IllegalArgumentException ("Value must be greater than 0")
    }

    var driverName:String = ""
    get(){
        return field.toLowerCase()
    }
    var driverAge:Int  = 0
    set(value){
        field = if (value < 18) value else
            throw IllegalArgumentException("Driver is  underage")
    }
    var driverGender: String = ""

    get(){
        return field.toLowerCase()
    }
    var driverType: String = ""
    get(){
        return field.toLowerCase()
    }
}

