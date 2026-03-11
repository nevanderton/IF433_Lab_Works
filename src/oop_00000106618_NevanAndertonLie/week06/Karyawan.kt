package oop_00000106618_NevanAndertonLie.week06

class Karyawan(
    override val namaKerjaan: String,
    override val gaji: Int,
    override val jmlHari: Int
):Bekerja {
    override fun ngoding() {
        println("kerjaan kamu $namaKerjaan");
        println("Gaji kamu ${super.GajiDidapat}");
    }

}