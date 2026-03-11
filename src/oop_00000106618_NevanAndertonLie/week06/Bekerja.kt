package oop_00000106618_NevanAndertonLie.week06

interface Bekerja {
    public val namaKerjaan:String;
    val gaji:Int;
    val jmlHari:Int;
    val GajiDidapat:Int
        get() = gaji * jmlHari;

    public fun ngoding() {
        println("Kerja ngoding");
    }
}