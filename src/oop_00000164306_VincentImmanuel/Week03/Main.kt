package oop_00000164306_VincentImmanuel.week03

fun main() {
    val w = Weapon("Sword of Doom")

    w.damage = -50 // harus gagal (warning, nilai tetap)
    println("Damage setelah percobaan negatif: ${w.damage}")

    w.damage = 9999 // harus jadi 1000
    println("Damage setelah 9999: ${w.damage}")

    println("Tier: ${w.tier}")
}