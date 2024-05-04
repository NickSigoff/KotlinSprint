package org.example.lesson_5

fun main() {
    val firstWinNumber = 15
    val secondWinNumber = 30
    println("Введите два разных числа, чтобы сыграть в лоттерею")
    val userFirstNumber = readln().toInt()
    val userSecondNumber = readln().toInt()

    if (userFirstNumber == userSecondNumber) {
        println("Вы ввели одинаковые числа. Попробуйте ещё раз.")
    }

    if ((userFirstNumber == firstWinNumber || userFirstNumber == secondWinNumber) && (userSecondNumber == firstWinNumber || userSecondNumber == secondWinNumber)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((userFirstNumber == firstWinNumber || userFirstNumber == secondWinNumber) || (userSecondNumber == firstWinNumber || userSecondNumber == secondWinNumber)) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

    println("Победные числа: $firstWinNumber и $secondWinNumber")
}