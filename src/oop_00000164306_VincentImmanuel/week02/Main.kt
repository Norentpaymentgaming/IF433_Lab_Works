package oop_00000164306_VincentImmanuel.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val baseDamage = scanner.nextInt()
    scanner.nextLine()

    val hero = Hero(heroName, baseDamage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {
        println("1. Serang, 2. Kabur")
        print("Pilihan: ")
        val choice = scanner.nextInt()
        scanner.nextLine()

        if (choice == 1) {
            enemyHp -= hero.baseDamage
            println("Sisa HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                hero.takeDamage(enemyDamage)
                println("Sisa HP Hero: ${hero.hp}")
            }
        } else if (choice == 2) {
            println("Kabur dari pertarungan!")
            break
        }
    }

    if (enemyHp <= 0) {
        println("$heroName menang!")
    } else if (!hero.isAlive()) {
        println("Musuh menang!")
    }
}