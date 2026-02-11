package oop_00000106618_NevanAndertonLie.week02

class Jagoan {
    var nama:String = "unknown";
    var hp:Int = 100;

    init {
        println("Jagoan paling jago: $nama");
        nama = "Udin";
        hp = 120;
    }

    constructor(darahhero:Int = 200) {
        println("Ini adalah constructor kedua");
        this.nama = "Madindindun";
        this.hp = darahhero;
    }

    fun jalan() {
        //codingan utk jalan
        //x+ = 3
        //this bla bla bla bla
        println("Hero jalan kaki ke pasar");
    }

    fun serang() {
        println("Hero serang dengan life: $hp");
    }
}

fun main() {
    val hero = Jagoan(darahhero = 250);
    println("darah hero: ${hero.hp}");

    hero.jalan();
    hero.serang();

    println("Nama jagoannya adalah " + hero.nama);
}