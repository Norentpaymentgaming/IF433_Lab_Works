package oop_00000164306_VincentImmanuel.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}