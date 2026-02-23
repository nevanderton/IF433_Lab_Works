package oop_00000106618_NevanAndertonLie.week04

class Car(
    brand: String,
    val numberOfDoors: Int
) : Vehicle(brand) {

    fun openTrunk() {
        println("$brand membuka bagasi.")
    }
}
