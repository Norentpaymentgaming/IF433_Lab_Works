package oop_00000164306_VincentImmanuel.week01

fun main() {
    val gameTitle = "Minecraft"
    val price = 600000
}

fun calculateDiscount(price: Int): Int = if (price > 500000) {
    price * 20 / 100
} else {
    price * 10 / 100
}