package oop_00000106618_NevanAndertonLie.week04

open class Pakaian {
    private var merk:String = "";
    protected var harga:Int = 0;

    init {
        this.merk = "Uniqlo";
    }

    open fun jumlah_penjualan() {
        println("Pakaian Terjual");
    }
}