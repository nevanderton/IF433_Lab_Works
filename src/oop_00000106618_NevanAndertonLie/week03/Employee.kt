package oop_00000106618_NevanAndertonLie.week03

class Employee {

    var salary: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("Salary tidak boleh negatif!")
            }
        }
}