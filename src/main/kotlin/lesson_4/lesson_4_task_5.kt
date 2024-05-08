package org.example.lesson_4

import java.util.*

fun main() {
    println("Корпус поврежден? true/false")
    val isDamaged = readln().toBoolean()
    println("Введите количество членов команды")
    val crew = readln().toInt()
    println("Введите количество ящиков с провизией")
    val boxesOfProvision = readln().toInt()
    println("Погода благоприятная? true/false")
    val isFavourableWeather = readln().toBoolean()

    val canBeSent =
        (!isDamaged && crew in 55..70 && boxesOfProvision > 50) || (crew == 70 && isFavourableWeather && boxesOfProvision >= 50)

    print("Корабль может быть отправлен: $canBeSent")
}