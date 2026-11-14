package oop_00000164306_VincentImmanuel.week10

interface Named {
    val name: String
}

data class Coin(override val name: String, val balance: Double) : Named

data class Transaction(val id: String, val amount: Double)