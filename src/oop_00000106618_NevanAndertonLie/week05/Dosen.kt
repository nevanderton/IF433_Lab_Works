package oop_00000106618_NevanAndertonLie.week05


class Dosen(nama: String, nidn: String) : Pegawai(nama) {
    override val nidn: String
        get() = TODO("Not yet implemented")

    override fun bekerja() {
        println("Dosen $nama sedang mengajar di kelas.")
    }

    fun mengajar() {
        println("Dosen $nama memberikan materi perkuliahan.")
    }
}