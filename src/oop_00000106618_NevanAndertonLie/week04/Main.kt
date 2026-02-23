package oop_00000106618_NevanAndertonLie.week04

fun main() {

    val car = Car("Toyota", 4)
    val motor = Motorcycle("Yamaha", false)
    val tesla = ElectricCar("Tesla", 4)

    println("=== CAR ===")
    car.accelerate()
    car.honk()
    car.openTrunk()

    println("\n=== MOTORCYCLE ===")
    motor.accelerate()
    motor.honk()
    motor.doWheelie()

    println("\n=== ELECTRIC CAR ===")
    tesla.accelerate()
    tesla.honk()
    tesla.showChargingPort()
    tesla.chargeBattery()

    println("\n=== POLYMORPHISM TEST ===")

    val vehicles: List<Vehicle> = listOf(car, motor, tesla)

    for (vehicle in vehicles) {
        vehicle.accelerate()
        vehicle.honk()
    }
}
