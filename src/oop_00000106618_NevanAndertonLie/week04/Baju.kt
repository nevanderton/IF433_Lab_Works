package oop_00000106618_NevanAndertonLie.week04

class Baju: Pakaian() {
    private var stock:Int = 10;
    public fun update_stock() {
        super.harga = stock + 100;
        println("Stock $stock Baju Updated, " + "Harga ${super.harga}");
    }

    override public fun jumlah_penjualan() {
        println("Baju Terjual");
    }
}