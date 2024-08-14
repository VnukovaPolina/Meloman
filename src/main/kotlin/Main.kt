package ru.netology

fun main() {
    val isCurrentClient = true
    var purchaseSum = 12000

    if (purchaseSum >= 1001 && purchaseSum <= 10000) {
        purchaseSum -= 100
    }
    else if (purchaseSum >= 10001) {
        purchaseSum = (purchaseSum * 0.95).toInt()
    }

    if (isCurrentClient == true) {
        purchaseSum = (purchaseSum * 0.99).toInt()
    }

    println("Сумма покупки: $purchaseSum руб")
}