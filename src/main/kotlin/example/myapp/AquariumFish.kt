package org.example.example.myapp

interface FishAction  {
    fun eat()
}
abstract class AquariumFish {
    abstract val color: String
}

class Shark: AquariumFish(),FishAction {
     override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus: AquariumFish(),FishAction {
    override val color = "gold"
    override fun eat() {
        println("eat algae")

    }
}