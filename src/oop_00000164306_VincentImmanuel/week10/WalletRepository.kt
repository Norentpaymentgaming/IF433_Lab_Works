package oop_00000164306_VincentImmanuel.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }
}

fun <T : Named> WalletRepository<T>.search(keyword: String): List<T> {
    return getAll().filter { it.name.contains(keyword, ignoreCase = true) }
}