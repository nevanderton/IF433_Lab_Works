package oop_00000106618_NevanAndertonLie.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("⚔️ Monster muncul: ${event.monsterName}! Bersiap untuk bertarung!")
        }
        is BattleState.LootDropped -> {
            println("🎁 Loot didapat: ${event.item.name} | Damage: ${event.item.damage} | Rarity: ${event.item.rarity}")
        }
        is BattleState.GameOver -> {
            println("💀 Game Over! Alasan: ${event.reason}")
        }
        is BattleState.SafeZone -> {
            println("🏕️ Kamu berada di Safe Zone. Beristirahatlah sejenak.")
        }
    }
}