package oop_00000106618_NevanAndertonLie.week01

fun main() {

    val gameTitle = "Elden Ring"
    val price = 750_000

    val finalPrice = calculateDiscount(price)

    println("Judul Game : $gameTitle")
    println("Harga Asli : Rp$price")
    println("Harga Akhir: Rp$finalPrice")
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000)
        price - (price * 20 / 100)
    else
        price - (price * 10 / 100)
