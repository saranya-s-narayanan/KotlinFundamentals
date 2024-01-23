package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

    printHello(name)
    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }

    checkDatatypes()
    checkNullables()
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