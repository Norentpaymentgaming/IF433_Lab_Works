package oop_00000164306_VincentImmanuel.week02

class Loan(
    val bookTitle: String,
    val borrower: String,
    var loanDuration: Int = 1
) {
    fun calculateFine(): Int {
        if (loanDuration > 3) {
            return (loanDuration - 3) * 2000
        } else {
            return 0
        }
    }
}