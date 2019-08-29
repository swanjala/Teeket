package models

import java.lang.IllegalArgumentException
import java.util.Date

class Trip {
    var tripState:String = ""
    get(){
        return tripState.trim().toLowerCase()
    }
    var tripStartTime: Date? = null

    set(value){
        field = if(value is Date)value else throw
                IllegalArgumentException(" Start time should be type date")
    }
    var tripExpectedArrivalTime:Date? = null

    set(value){
        field = if(value is Date)value else throw
                IllegalArgumentException("Expected time of arrival should be " +
                        "type date")
    }
    var startPoint:String = ""
    get() {
        return startPoint.trim().toLowerCase()
    }
    var destination:String = ""
    var stations:ArrayList<Station>? = null
    set(value){
        field = if(value is ArrayList)value else throw
                IllegalArgumentException("The data expects arraylist")
    }
    var busId:Int? = null
    set(value){
        field = if(value is Int)value else throw
                IllegalArgumentException("BusId should be an integer")
    }
}