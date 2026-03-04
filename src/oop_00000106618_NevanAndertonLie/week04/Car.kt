package oop_00000106618_NevanAndertonLie.week04

open class Car(
    brand: String,
    val numberOfDoors: Int
) : Vehicle(brand) {

    override fun honk() {
        println("$brand membunyikan klakson mobil: Tiiin! Tiiin!")
    }

    fun openTrunk() {
        println("$brand membuka bagasi.")
    }
}
