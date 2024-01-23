package org.example.example.myapp

//class Aquarium { //<-- First version
//    var width:Int = 20
//    var height:Int = 40
//    var length:Int = 100


//class Aquarium(width:Int=20,height:Int=40,length:Int=100) { //<---Second version
//
//    var width:Int = width
//    var height:Int = height
//    var length:Int = length

class Aquarium(var width:Int=20,var height:Int=40,var length:Int=100) { // <-- Compact version

    init {
        println("aquarium initializing")
    }
    init {
        // 1 liter = 1000 cm^3
        println("Volume: ${width * length * height / 1000} l")
    }
    fun printSize() { // <--- First version
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }

//    fun printSize():String = "Width: $width cm " +
//                                "Length: $length cm " +
//                                "Height: $height cm "
}