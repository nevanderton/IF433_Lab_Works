package oop_00000106618_NevanAndertonLie.week07

    fun main() {
        println("Server: " + Koneksi.alamatServer);
        Koneksi.konek_db()

        println("Kampus: " + Hitungan.namaKampus);
        println("Nomor: " + Hitungan.noIndukKampus);
        println("Tambahan: " + Hitungan.penambahan(a = 20, b = 20));
    }