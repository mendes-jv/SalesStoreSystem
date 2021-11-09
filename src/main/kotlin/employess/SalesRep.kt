package employess

class SalesRep(val salesMade: Double,
               firstName: String,
               lastName: String,
               registration: Int,
               age: Int,
               daysWorked: Int,
               vacationDaysTaken: Int,
               salary: Double,
               yearsWorked: Int): Employee(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked) {

    fun calculateComission(): Double {
        return 0.1 * salesMade
    }
}