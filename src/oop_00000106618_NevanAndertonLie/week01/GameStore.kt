package oop_00000106618_NevanAndertonLie.week01

fun main() {

    val gameTitle = "Elden Ring"
    val price = 750_000

    val finalPrice = calculateDiscount(price)

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000)
        price - (price * 20 / 100)
    else
        price - (price * 10 / 100)

fun printReceipt(title: String, finalPrice: Int) {
    println("===== STRUK PEMBELIAN =====")
    println("Judul Game : $title")
    println("Harga Akhir: Rp$finalPrice")
}
