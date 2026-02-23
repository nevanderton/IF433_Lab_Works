package oop_00000106618_NevanAndertonLie.week03


class Employee {

    var salary: Int = 0
        set(value) {
            this.salary = value   // SALAH -> menyebabkan infinite recursion
        }
}