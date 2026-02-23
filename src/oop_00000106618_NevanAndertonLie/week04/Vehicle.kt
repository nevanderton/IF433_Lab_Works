package oop_00000106618_NevanAndertonLie.week04

open class Vehicle(
    val brand: String
) {

    open fun accelerate() {
        println("$brand sedang berakselerasi.")
    }

    open fun honk() {
        println("$brand membunyikan klakson: Beep! Beep!")
    }
}
