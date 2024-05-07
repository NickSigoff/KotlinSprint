package org.example.lesson_5

import java.time.LocalDate
import java.util.*

fun main() {
    val majorityAge = 18
    println("Введите год своего рождения")
    val userYear = readln().toInt()
    val currentYear = LocalDate.now().year
    if (currentYear - userYear >= majorityAge) {
        println("Показать экран со скрытым контентом")
    }
}