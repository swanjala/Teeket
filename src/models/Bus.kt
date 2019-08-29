package models

import java.lang.IllegalArgumentException

class Bus{

    var busName: String = ""
    get() {
        return field.toLowerCase()
    }
    set(value){
        field = busName
    }

    var busCapacity:Int = 0

    set(value){
        field= if (value < 0) value else
            throw IllegalArgumentException("Bus cannot have negative capacity")
    }

    var luggageCapacity:Int = 0

    set(value){
        field = if (value < 0 ) value else
            throw IllegalArgumentException("Luggage capacity cannot be negative")
    }

    var routeCode: Int = 0

}
