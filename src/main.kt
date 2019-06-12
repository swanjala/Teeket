import models.Passenger

fun main(args:Array<String>){


    print("${greetingText()}")


}

fun greetingText() : String{
    val greetingInstructions:String = "\t WELCOME TO Teeket\n" +
            "Choose an option below : \n" +
            "\t\t1. Book a ticket \n" +
            "\t\t2. List all trip to a destination"


    return greetingInstructions
}
