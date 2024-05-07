package org.example.lesson_4

const val FAVOURABLE_HUMIDITY_PERCENT = 20
const val NOT_FAVOURABLE_SEASON = "Зима"
const val NECESSARILY_SUNNY_WEATHER = true
const val NECESSARILY_OPENED_TENT = true

fun main() {
    val isSunnyWeather = true
    val isTentOpened = true
    val humidityPercent = 20
    val season = "Зма"

    val areFavourableConditions =
        isSunnyWeather == NECESSARILY_SUNNY_WEATHER &&
                isTentOpened == NECESSARILY_OPENED_TENT &&
                humidityPercent == FAVOURABLE_HUMIDITY_PERCENT &&
                season != NOT_FAVOURABLE_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $areFavourableConditions")
}