package oop_00000164306_VincentImmanuel.week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() { println("Lampu $name menyala.") }
    override fun turnOff() { println("Lampu $name mati.") }
}