package oop_00000106618_NevanAndertonLie.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {

    companion object {
        fun forgeStarterSword(): Weapon {
            println("Menempa Pedang Kayu Bapuk...")
            return Weapon(
                item = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON),
                durability = 50
            )
        }

        fun forgeEpicSword(): Weapon {
            println("Menempa Pedang Epik...")
            return Weapon(
                item = GameItem("Pedang Naga Merah", 80, ItemRarity.EPIC),
                durability = 200
            )
        }
    }

    override fun toString(): String {
        return "Weapon(name=${item.name}, damage=${item.damage}, rarity=${item.rarity}, durability=$durability)"
    }
}