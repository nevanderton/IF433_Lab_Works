package oop_00000106618_NevanAndertonLie.week03

class Employee(val name: String) {

    var salary: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("Error: Salary tidak boleh negatif!")
            }
        }

    // Hanya bisa diakses di file/class ini saja
    private var performanceRating: Int = 3

    fun increasePerformance() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }

    // Tax (Pajak) dihitung 10% dari gaji saat ini
    val tax: Double
        get() = salary * 0.1
}
