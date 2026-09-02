package oop_00000164306_VincentImmanuel.week01

fun main() {
    val gameTitle = "Minecraft"
    val price = 600000
    val discount = calculateDiscount(price)
    val finalPrice = price - discount
    val userNote: String? = null

    println("Judul: $gameTitle")
    println("Harga Asli: Rp$price")
    printReceipt(title = gameTitle, finalPrice = finalPrice)
    println("Catatan: ${userNote ?: "Tidak ada catatan"}")
}

fun calculateDiscount(price: Int): Int = if (price > 500000) {
    price * 20 / 100
} else {
    price * 10 / 100
}

fun printReceipt(title: String, finalPrice: Int) {
    println("Harga Akhir: Rp$finalPrice")
}