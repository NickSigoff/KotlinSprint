package org.example.lesson_4

import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    println("Корпус поврежден? true/false")
    val isDamaged = input.nextBoolean()
    println("Введите количество членов команды")
    val crew = input.nextInt()
    println("Введите количество ящиков с провизией")
    val boxesOfProvision = input.nextInt()
    println("Погода благоприятная? true/false")
    val isFavourableWeather = input.nextBoolean()

    val canBeSent =
        (!isDamaged && crew in 55..70 && boxesOfProvision > 50) || (crew == 70 && isFavourableWeather && boxesOfProvision >= 50)

    print("Корабль может быть отправлен: $canBeSent")
}