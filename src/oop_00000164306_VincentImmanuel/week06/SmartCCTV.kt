package oop_00000164306_VincentImmanuel.week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV $name menyala.")
        startRecord()
    }

    override fun turnOff() { println("CCTV $name mati.") }

    override fun startRecord() { println("CCTV $name mulai merekam.") }
}