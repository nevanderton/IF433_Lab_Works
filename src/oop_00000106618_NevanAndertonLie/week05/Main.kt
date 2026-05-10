package oop_00000106618_NevanAndertonLie.week05

fun main() {

    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(
        nama = "Bu Siti",
        nidn = TODO()
    )

    // Polymorphic Collection: List yang berisi tipe Parent, tapi isinya objek Anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {

        // Pemanggilan Runtime Polymorphism
        pegawai.bekerja()

        // pegawai.mengajar() // INI AKAN ERROR karena tipe referensinya adalah Pegawai

        // Smart Casting dengan is dan when
        when (pegawai) {

            is Dosen -> {
                println("-> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar() // Smart cast! Tidak perlu manual casting (as)
            }

            is Admin -> {
                println("-> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }

        println("----------------------------")
    }

    println("=== TEST MATH HELPER ===")

    val mathHelper = MathHelper()

    val luasPersegi = mathHelper.hitungLuas(4)
    println("Luas Persegi: $luasPersegi")

    val luasPersegiPanjang = mathHelper.hitungLuas(5, 6)
    println("Luas Persegi Panjang: $luasPersegiPanjang")

    val luasLingkaran = mathHelper.hitungLuas(7.0)
    println("Luas Lingkaran: $luasLingkaran")

    println("=== SISTEM PEMBAYARAN ===")

    val eWallet = EWallet("Nevan", 50000.0)
    val creditCard = CreditCard("Nevan", 100000.0)

    val metodePembayaran: List<PaymentMethod> = listOf(eWallet, creditCard)

    for (metode in metodePembayaran) {

        metode.processPayment(75000.0)

        if (metode is EWallet) {
            metode.topUp(50000.0)
            metode.processPayment(75000.0)
        }

        println("----------------------------")
    }
}