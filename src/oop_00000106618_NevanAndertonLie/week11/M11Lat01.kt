package oop_00000106618_NevanAndertonLie.week11

// function extension - basic
fun String.rubah_huruf_depan_jadi_besar(): String {
    val hasil = this.split(" ").joinToString(" ") {
        it.replaceFirstChar { c -> c.uppercase() }
    }
    return "Hai $hasil"
}

fun String?.cekNulldanEmpty(): Boolean {
    return this == null || this.isEmpty()
}

fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}

fun Int.tentukanGrade(namaMhs: String): String {
    val hasilGrade = when {
        this >= 80 -> "A"
        this >= 70 -> "B"
        else -> "C"
    }
    return "$namaMhs Grade Kamu: $hasilGrade"
}

fun main() {

    // EXTENSION FUNCTION
    println("udin sedunia".rubah_huruf_depan_jadi_besar())

    val hasilStr = 71.tentukanGrade("Eligrah")
    println(hasilStr.repeat(2))

    val result = "Hi".repeatTimes(3)
    println(result)

    var usernameKamu: String? = null
    println(usernameKamu.cekNulldanEmpty())

    // SCOPE - LET
    val kampusKamu: String = "UMN"
    kampusKamu.let {
        println("Nama kampus kamu: $it")
        if (it == "UMN") {
            println("Ih keren")
        } else {
            println("Amazing")
        }
    }

    // SCOPE - RUN
    val namaMatkul: String = "OOP"
    namaMatkul.run {
        println("Matkul favorite saya: $this")
    }

    // SCOPE - WITH
    val keputusanLulus = with(70) {
        if (this >= 70) {
            "Lulus"
        } else {
            "Remedial"
        }
    }
    println("Kamu $keputusanLulus")
}