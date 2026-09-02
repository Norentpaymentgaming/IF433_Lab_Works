package oop_00000164306_VincentImmanuel.week01

fun main(args: Array<String>) {

    // Variable definition
    val radius = 7.0
    val pi = 3.14

    // Calculation
    var area = pi * radius * radius

    // Output Concatenation
    println("Radius: $radius, Area: $area")

    // Logic check
    println(checkSize(area))
}

fun checkSize(area: Double) = if (area > 100) {
    "This is a Big Circle"
} else {
    "This is a Small Circle"
}