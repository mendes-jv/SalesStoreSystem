package employess

class SalesManager(firstName: String,
                   lastName: String,
                   registration: Int,
                   age: Int,
                   daysWorked: Int,
                   vacationDaysTaken: Int,
                   salary: Double,
                   yearsWorked: Int): Employee(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked) {

    private val salesTeam = hashMapOf<Int, SalesRep>()

    fun calculateComissionManager() {
        var salesNumber = 0.0
        if(salesTeam.isEmpty()){
            println("Não há Representantes de Vendas na equipe")
        }else {
            for(item in salesTeam) {
                salesNumber += item.value.salesMade
            }
            println("${0.03 * salesNumber}")
        }
    }

    fun addSalesRep(salesRep: SalesRep){
        salesTeam[salesRep.registration] = salesRep
    }

}