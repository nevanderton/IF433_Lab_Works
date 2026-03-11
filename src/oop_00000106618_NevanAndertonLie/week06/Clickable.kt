package oop_00000106618_NevanAndertonLie.week06

interface Clickable {

    // ERROR: Property in an interface cannot have a backing field
    val name: String = "Tombol Rahasia"

    // Function without body (Implicitly Abstract)
    fun click()
}
