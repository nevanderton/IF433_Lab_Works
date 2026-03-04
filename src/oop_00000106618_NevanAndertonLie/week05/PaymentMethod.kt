package oop_00000106618_NevanAndertonLie.week05

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)
}gt