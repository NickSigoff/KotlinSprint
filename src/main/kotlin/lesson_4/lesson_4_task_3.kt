package org.example.lesson_4

fun main() {
    val isSunnyWeather = true
    val isTentOpened = true
    val humidityPercent = 20
    val season = "Зима"

    val areFavourableConditions = isSunnyWeather && isTentOpened && humidityPercent == 20 && season != "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $areFavourableConditions")
}