package main

import employess.SalesManager
import employess.SalesRep

fun main() {

    val roger = SalesRep(12.0, "Roger", "Jorge", 30, 15, 490, 39, 3969.00,
        4)

    val silverstone = SalesRep(47.0, "Silverstone", "Johnny", 28, 16, 306, 38, 3823.00,
        3)

    val sagan = SalesRep(37.0, "Sagan", "Carl", 20, 17, 937, 34, 3475.00,
        4)

    val austros = SalesManager("Austros", "Menezes", 304, 20, 675, 30, 3756.00,
        5)

    println(silverstone.timeToRetirement())
    println(silverstone.vacationTimeLeft())
    println(silverstone.calculateBonus())
    println(silverstone.calculateComission())
    austros.addSalesRep(roger)
    austros.addSalesRep(silverstone)
    austros.addSalesRep(sagan)
    austros.calculateComissionManager()
}