package oop_00000106618_NevanAndertonLie.week04

class Celana: Pakaian() {
    private var stock:Int = 20;
    public fun update_stock() {
        super.harga = stock + 120;
        println("Stock $stock Celana Updated, " + "Harga ${super.harga}");
    }
}