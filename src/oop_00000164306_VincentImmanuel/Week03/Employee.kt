package oop_00000164306_VincentImmanuel.Week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            this.salary = value
        }
}