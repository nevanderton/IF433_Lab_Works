package oop_00000106618_NevanAndertonLie.week03

class Pelajar {
    public var nama: String = "Belum ada nama";
    private var nilai: Int = 0;

    public fun set_nama(namaorang:String) {
        if(namaorang.length < 0) {
            println("EH nama orang ga boleh kosong");
        } else {
            this.nama = namaorang;
        }
    }

    public fun get_nama():String {
        return this.nama;
    }

    public fun set_nilai(nilaiorang: Int) {
        if(nilaiorang < 0) {
            println("EH nilai ga boleh minus ya!");
        } else {
            this.nilai = nilaiorang;
        }
    }

    public fun get_nilai(): Int {
        return this.nilai;
    }
}

fun main() {
    var mahasiswa = Pelajar()
    mahasiswa.set_nama("Udin");
    println("Nama Kamu: " + mahasiswa.get_nama());
    mahasiswa.set_nilai(20);
    println("Nilai Kamu: " + mahasiswa.get_nilai());
    // println("Halo " + mahasiswa.nama + " Nilai kamu " + mahasiswa.nilai);
}
