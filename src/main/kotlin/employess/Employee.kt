package employess

import kotlin.math.min

//Declaring class and attributes
abstract class Employee(val firstName: String,
                        val lastName: String,
                        val registration: Int,
                        val age: Int,
                        val daysWorked: Int,
                        val vacationDaysTaken: Int,
                        val salary: Double,
                        val yearsWorked: Int) {

    //Declaring methods
    fun timeToRetirement(): Int {

        return min(60 - age, 40 - yearsWorked)
    }

    fun vacationTimeLeft(): Int {

        return (daysWorked / 360) * (30 - vacationDaysTaken)
    }

    fun calculateBonus(): Double {

        return 2.2 * salary
    }
}