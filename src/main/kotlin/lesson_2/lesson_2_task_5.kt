package org.example.lesson_2

fun main() {
    val initialSumOfMoney = 70_000
    val percent = 0.167
    val bankDepositDurationInYears = 20

    var resultSum = initialSumOfMoney.toDouble()
    for (i in 1..bankDepositDurationInYears) {
        resultSum += resultSum * percent
    }

    println("Result sum of money: ${String.format("%.3f", resultSum)}")
}