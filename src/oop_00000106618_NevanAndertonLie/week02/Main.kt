package oop_00000106618_NevanAndertonLie.week02

fun main() {

    val student1 = Student(
        nim = "0000010661",
        name = "Nevan Anderton Lie",
        major = "Informatics",
        gpa = 3.75
    )

    println("=== STUDENT DATA ===")
    println("NIM   : ${student1.nim}")
    println("Name  : ${student1.name}")
    println("Major : ${student1.major}")
    println("GPA   : ${student1.gpa}")

    println(student1.introduce())

    student1.changeMajor("Computer Science")

    println(student1.introduce())
}
