package org.example.lesson_5

import java.util.*

fun main() {
    val random = Random()
    val firstNumber = random.nextInt(20)
    val secondNumber = random.nextInt(20)
    println("Чтобы авторизоваться введите сумму $firstNumber + $secondNumber")
    val userResult = readln().toInt()
    if (firstNumber + secondNumber == userResult) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}