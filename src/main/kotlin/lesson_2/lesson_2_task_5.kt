package org.example.lesson_2

fun main() {
    val initialSumOfMoney = 70_000
    val percent = 16.7
    val bankDepositDurationInYears = 20

    var resultSum = initialSumOfMoney.toDouble()
    for (i in 1..bankDepositDurationInYears) {
        resultSum += resultSum * percent / 100
    }

    println("Result sum of money: ${String.format("%.3f", resultSum)}")
}