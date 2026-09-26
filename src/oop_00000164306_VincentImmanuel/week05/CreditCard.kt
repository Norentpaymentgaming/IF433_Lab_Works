package oop_00000164306_VincentImmanuel.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] Pembayaran sebesar $amount berhasil. Total terpakai: $usedAmount")
        } else {
            println("[$accountName] Transaksi ditolak, melebihi limit")
        }
    }
}