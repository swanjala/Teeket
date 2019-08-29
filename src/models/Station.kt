package models

import java.lang.IllegalArgumentException

class Station{

    var stationId:Int = 0
    set(value){
        field = if (stationId is Int) value else throw
                IllegalArgumentException("Station Id should be Integer")
    }
    var stationName:String = ""
    get() {
        return stationName.trim().toLowerCase()
    }
    var stationState: String = ""
        get() {
            return stationState.trim().toLowerCase()
        }
    var stationCounty: String = ""
        get() {
            return stationCounty.trim().toLowerCase()
        }
    var stationCapacity:Int = 0
        set(value){
            field = if (stationCapacity is Int) value else throw
            IllegalArgumentException("Station Capacity should be Integer")
        }
}