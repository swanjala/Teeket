package test

import models.Passenger
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RegistrationTest {

    companion object{

        @JvmStatic
        var passanger:Passenger = Passenger()
        var dataCountInit:Int = 0
        var dataCountFinal:Int = 0
        var personalData:ArrayList<Passenger> = ArrayList()

        @JvmStatic
        fun initialize() {

            passanger.age = 21
            passanger.name = "Sample name"
            passanger.passangerId = 2242
            passanger.passengerTravelClass = 123
            passanger.passengerTravelStatus = "Pending"
            passanger.passengerType = "Economy"
        }
    }
    @Test
    fun `data can be added`(){

        personalData.add(passanger)
        dataCountFinal = personalData.size

        assertEquals(dataCountFinal -dataCountInit,1)
    }
    @Test
    fun `data can be removed`() {
        personalData.removeAt(0)

        assertEquals(personalData.size, 0)
    }

}