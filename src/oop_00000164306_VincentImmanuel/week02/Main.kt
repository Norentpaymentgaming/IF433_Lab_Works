package oop_00000164306_VincentImmanuel.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- SISTEM PEMINJAMAN BUKU ---")

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam: ")
    var loanDuration = scanner.nextInt()

    // Validasi: lama pinjam tidak boleh minus
    if (loanDuration < 0) {
        loanDuration = 1
    }

    val loan = Loan(bookTitle, borrower, loanDuration)

    println("Judul: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Lama Pinjam: ${loan.loanDuration} hari")
    println("Total Denda: ${loan.calculateFine()}")
}