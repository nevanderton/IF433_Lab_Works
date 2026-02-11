package oop_00000106618_NevanAndertonLie.week01 // Pastikan package sesuai

fun calculateStatus(score: Int) =
    if (score > 75) "Lulus" else "Tidak Lulus"

fun main() {
    val name: String = "John Thor"
    val score: Int = 80

    println("Nama: " + name + ", Nilai: " + score)

    val grade = when (score) {

        else -> "D"
    }

    println("Grade kamu: $grade")
    println("Status: ${calculateStatus(score)}")

    // Tambahkan di akhir main()
    val studentId: String? = null
    val idLength = studentId?.length ?: 0
    println("Panjang ID: $idLength")
}

