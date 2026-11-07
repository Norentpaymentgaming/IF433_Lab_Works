package oop_00000164306_VincentImmanuel.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 15, 8.3, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 25, -12.1, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 10, 4.7, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 20, -2.4, "OPEN")
    )
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }
}