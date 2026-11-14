package oop_00000164306_VincentImmanuel.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 4.2))
    coinRepo.add(Coin("USDT", 1500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")
    response.data.forEach { println("Coin: ${it.name}, Balance: ${it.balance}") }

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 0.1))
    txRepo.add(Transaction("TX002", 250.0))
    txRepo.add(Transaction("TX003", 1.5))

    txRepo.getAll().forEach { println("Transaction: ${it.id}, Amount: ${it.amount}") }
}