package oop_00000164306_VincentImmanuel.week01 // Make sure the package is in accordance

fun main() {
    // Refactor: Gunakan val dan hapus tipe data eksplisit
    val name = "John Thor"
    val score = 80

    // Refactor: String Template ($name)
    println("Nama: $name, Nilai: $score")

    // Tambahkan di bawah println
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("Grade kamu: $grade")
}

