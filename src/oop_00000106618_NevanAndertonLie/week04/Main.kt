package oop_00000106618_NevanAndertonLie.week04

fun main() {

    val car = Car("Toyota", 4)
    val motor = Motorcycle("Yamaha", false)

    println("=== CAR ===")
    car.accelerate()
    car.honk()
    car.openTrunk()

    println("\n=== MOTORCYCLE ===")
    motor.accelerate()
    motor.honk()
    motor.doWheelie()
}
