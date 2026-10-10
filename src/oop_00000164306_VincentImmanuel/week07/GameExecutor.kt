package oop_00000164306_VincentImmanuel.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> println("Monster muncul: ${event.monsterName}!")
        is BattleState.LootDropped -> println("Item didapat: ${event.item.name} (${event.item.rarity})")
        is BattleState.GameOver -> println("Game Over: ${event.reason}")
        is BattleState.SafeZone -> println("Kamu berada di zona aman.")
    }
}
