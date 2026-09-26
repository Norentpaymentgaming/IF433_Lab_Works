package oop_00000164306_VincentImmanuel.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }

            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-------------------------")
    }

    val mathHelper = MathHelper()
    println(mathHelper.hitungLuas(5))
    println(mathHelper.hitungLuas(4, 6))
    println(mathHelper.hitungLuas(7.0))

    val eWallet = EWallet("Budi", 50000.0)
    val creditCard = CreditCard("Ani", 100000.0)

    val daftarPembayaran: List<PaymentMethod> = listOf(eWallet, creditCard)

    for (pembayaran in daftarPembayaran) {
        pembayaran.processPayment(75000.0)

        if (pembayaran is EWallet) {
            pembayaran.topUp(50000.0)
            pembayaran.processPayment(75000.0)
        }
    }
}