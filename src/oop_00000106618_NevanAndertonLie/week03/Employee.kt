package oop_00000106618_NevanAndertonLie.week03

class Employee {

    var name: String = ""

    var salary: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("Salary tidak boleh negatif!")
            }
        }

    // Hanya bisa diakses di dalam class
    private var performanceRating: Int = 3

    fun increasePerformance() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }
}
