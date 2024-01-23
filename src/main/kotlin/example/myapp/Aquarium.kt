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
//    init {
//        // 1 liter = 1000 cm^3
//        println("Volume: ${width * length * height / 1000} l")
//    }

    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        // calculate the height needed
        this.height = (tank / (this.length * this.width)).toInt()
    }

    var volume: Int
        get() = width * height * length / 1000  // 1000 cm^3 = 1 l
        set(value) {
            height = (value * 1000) / (width * length)
        }

    fun printSize() { // <--- First version
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        // 1 l = 1000 cm^3
        println("Volume: $volume l")
    }

//    fun printSize():String = "Width: $width cm " +
//                                "Length: $length cm " +
//                                "Height: $height cm "
}