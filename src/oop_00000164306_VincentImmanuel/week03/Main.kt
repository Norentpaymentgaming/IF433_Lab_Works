package oop_00000164306_VincentImmanuel.week03

fun main() {
    val player = Player("Alex")

    // player.xp // Coba uncomment, harus Error (private)

    player.addXp(50) // masih level 1
    println("Level saat ini: ${player.level}")

    player.addXp(60) // total 110, harus Level Up ke 2
    println("Level saat ini: ${player.level}")
}