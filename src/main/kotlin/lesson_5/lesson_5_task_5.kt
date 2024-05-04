package org.example.lesson_5

import java.util.*

fun main() {
    val random = Random()
    val maxLotteryNumber = 42

    val randomLotteryNumbers = mutableListOf<Int>()
    for (i in 0 until 3) {
        randomLotteryNumbers.add(random.nextInt(maxLotteryNumber))
    }

    println("Чтобы сыграть в лоттерею введите 3 разных числа от 0 до $maxLotteryNumber")
    val userNumbers = mutableListOf<Int>()
    for (i in 0 until 3) {
        userNumbers.add(readln().toInt())
    }
    val numbersIntersect = randomLotteryNumbers.intersect(userNumbers)
    when (numbersIntersect.size) {
        3 -> println("Были отгаданы все три числа! Вы выиграли джекпот")
        2 -> println("Были отгаданы два числа! Вы получаете крупный приз")
        1 -> println("Было отгадано одно число! Вы получаете утешительный приз")
        0 -> println("Не было отгадано ни одного числа. Вы проиграли")
    }
    println("Выигрышные числа: $randomLotteryNumbers")
}