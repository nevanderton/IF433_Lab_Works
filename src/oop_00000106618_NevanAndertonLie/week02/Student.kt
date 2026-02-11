package oop_00000106618_NevanAndertonLie.week02

class Student(
    val nim: String,
    val name: String,
    var major: String
) {

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

    fun introduce(): String {
        return "Halo, saya $name dari jurusan $major."
    }

    fun changeMajor(newMajor: String) {
        major = newMajor
        println("Jurusan berhasil diubah menjadi $major")
    }
}
