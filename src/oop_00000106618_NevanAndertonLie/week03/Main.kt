package oop_00000106618_NevanAndertonLie.week03

fun main() {
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")

    // ===== TEST WEAPON =====
    val weapon = Weapon("Excalibur")

    weapon.damage = -50
    weapon.damage = 9999

    println("Tier Weapon: ${weapon.tier}")
}
