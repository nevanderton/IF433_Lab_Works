package oop_00000106618_NevanAndertonLie.week04

class ElectricCar(
    brand: String,
    numberOfDoors: Int
) : Car(brand, numberOfDoors), Electric() {

    override fun accelerate() {
        println("$brand melaju dengan tenaga listrik yang halus.")
    }

    override fun chargeBattery() {
        println("$brand sedang mengisi baterai listrik.")
    }
}
