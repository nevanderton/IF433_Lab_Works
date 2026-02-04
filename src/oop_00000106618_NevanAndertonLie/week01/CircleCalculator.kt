package oop_00000106618_NevanAndertonLie.week01

fun main() {

    val radius = 7.0
    val pi = 3.14

    val area = pi * radius * radius

    println("Radius: $radius, Area: $area")
    println(checkSize(area))
}

fun checkSize(area: Double): String =
    if (area > 100) "This is a Big Circle" else "This is a Small Circle"

