package oop_00000106618_NevanAndertonLie.week02

class Student(
    val nim: String,
    val name: String,
    var major: String
) {

    var gpa: Double = 0.0

    constructor(nim: String, name: String, major: String, gpa: Double)
            : this(nim, name, major) {
        this.gpa = gpa
    }

    init {
        if (nim.length != 10) {
            println("WARNING: NIM harus 10 digit!")
        }

        if (name.isBlank()) {
            println("WARNING: Nama tidak boleh kosong!")
        }

        if (major.isBlank()) {
            println("WARNING: Jurusan tidak boleh kosong!")
        }
    }

    fun introduce(): String =
        "Halo, saya $name dari jurusan $major dengan IPK $gpa."

    fun changeMajor(newMajor: String) {
        major = newMajor
        println("Jurusan berhasil diubah menjadi $major")
    }

    fun isCumlaude(): Boolean = gpa >= 3.5
}
