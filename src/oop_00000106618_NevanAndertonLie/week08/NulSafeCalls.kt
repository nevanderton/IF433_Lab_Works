package oop_00000106618_NevanAndertonLie.week08

class Alamat(val nomor:String, val kota:String)
class Mahasiswa(val nama:String, val addr: Alamat)

fun main() {
    val alm = Alamat(nomor = "47", kota = "Tangerang");
    val mhs = Mahasiswa(nama = "Nevan", addr = alm);

}