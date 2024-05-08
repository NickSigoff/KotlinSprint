package org.example.lesson_4

const val REQUIRED_HUMIDITY_PERCENT = 20
const val NOT_FAVOURABLE_SEASON = "Зима"
const val IS_SUNNY_WEATHER_REQUIRED = true
const val IS_OPENED_TENT_REQUIRED = true

fun main() {
    val isSunnyWeather = true
    val isTentOpened = true
    val humidityPercent = 20
    val season = "Зима"

    val areFavourableConditions =
        isSunnyWeather == IS_SUNNY_WEATHER_REQUIRED &&
                isTentOpened == IS_OPENED_TENT_REQUIRED &&
                humidityPercent == REQUIRED_HUMIDITY_PERCENT &&
                season != NOT_FAVOURABLE_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $areFavourableConditions")
}