import models.Passenger

fun main(args:Array<String>){


    print("${greetingText()}")


    val option:Int = readLine()!!.toInt()

    while (option != 3) {

        if (option == 1) {
            bookTicket()
        } else if (option == 2) {
            listTripsToDestination()
        }
        print(option)
    }


}

fun greetingText() : String{
    val greetingInstructions:String = "\t WELCOME TO Teeket\n" +
            "Choose an option below : \n" +
            "\t\t1. Book a ticket \n" +
            "\t\t2. List all trip to a destination\n" +
            "\t\t3. Exit program"


    return greetingInstructions
}

fun bookTicket(){
    print("Welcome to Ticket Booking")
}

fun listTripsToDestination() {
    print("Welcome to List trips")
}

