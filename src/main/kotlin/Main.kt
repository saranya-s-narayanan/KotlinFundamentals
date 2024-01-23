package org.example

import org.example.example.myapp.Aquarium
import org.example.example.myapp.Plecostomus
import org.example.example.myapp.Shark
import org.example.example.myapp.TowerTank
import java.util.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // --------------------------- Loop traversal ---------------------------------------------
    /*val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

    printHello(name)
    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }*/
    // ------------------------------------------------------------------------------

    // -----------------------------Data types and Nullability---------------------------------------------
    // checkDatatypes()
    //checkNullables()
    // ------------------------------------------------------------------------------


    // ----------------------------Functions----------------------------------------------
    //checkFunctions()
    //feedTheFish()
    //swim()
    //swim("slow")
    //swim(speed = "Turtle-like")
    // ------------------------------------------------------------------------------

    // ---------------------------Filter and Lambda Expressions----------------------------------------
    /*val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    // eager, creates a new list
    val eager = decorations.filter { it [0] == 'p' }
    println("eager: $eager")*/

    /* val lazyMap2 = decorations.map {
         println("access: $it")
         it
     }*/

    /* val lazyMap = decorations.asSequence().map {
         println("access: $it")
         it
     }

     println("lazy: $lazyMap")
     println("-----")
     println("first: ${lazyMap.first()}")
     println("-----")
     println("all: ${lazyMap.toList()}")*/

    /*val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
        println("access: ${it}")
        it
    }
    println("-----")
    println("filtered: ${lazyMap2.toList()}")*/
    // ------------------------------------------------------------------------------

    // -----------------------Classes and Interfaces------------------------------------

    //buildAquarium()
    makeFish()

    // ------------------------------------------------------------------------------

}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}
fun buildAquarium() {
//    val aquarium=Aquarium()
//    aquarium.printSize() // print class
//    // default height and length
//    val aquarium2 = Aquarium(width = 25)
//    aquarium2.printSize()
//    // default width
//    val aquarium3 = Aquarium(height = 35, length = 110)
//    aquarium3.printSize()
//    // everything custom
//    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
//    aquarium4.printSize()


    val aquarium5=Aquarium(numberOfFish = 29)
    aquarium5.printSize()
    aquarium5.volume = 70
    aquarium5.printSize()

    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun swim(speed: String = "fast") {
    println("swimming $speed")
}
fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
}

fun fishFood(day: String): String {
    /*var food=""
    when(day){
        "Monday" -> food="flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Saturday" -> food = "lettuce"
       // "Sunday" -> food = "plankton"
        else -> food = "nothing"
    }
return food*/

    return when(day){
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        // "Sunday" -> "plankton"
        else ->  "nothing"
    }
}

fun randomDay(): String {

    val days= arrayOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
    return days[Random().nextInt(days.size)]
}

fun checkFunctions() {
    // Will assign kotlin.Unit
    val isUnit = println("This is an expression")
    println(isUnit)
}

fun checkNullables() {
    var x: Int? =null
    /*  if(x!=null)
          println("Var not null")
      else
          println("Var is null")*/

    println("VAR is ${(x?.toInt())?.plus(1)}")
    //  println("VAR is ${(x!!.toInt())?.plus(1)}")

    println("VAR2 is ${x?.toInt() ?: 34}")

}

fun checkDatatypes() {

    val x:Int=9
    println("x ${x}")

    val y:String=x.toString()
    println("y ${y}")

}

fun printHello(name: String) {
    println("Hello, "+name+"!")
}