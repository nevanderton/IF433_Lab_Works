package oop_00000106618_NevanAndertonLie.week04

class Motorcycle(
    brand: String,
    val hasSidecar: Boolean
) : Vehicle(brand) {

    override fun honk() {
        println("$brand membunyikan klakson motor: Piiip! Piiip!")
    }

    fun doWheelie() {
        println("$brand melakukan wheelie!")
    }
}
