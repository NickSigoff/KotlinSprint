package org.example.lesson_2

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeInMinutes = 457

    var arrivalHour = (departureHour + travelTimeInMinutes / 60)
    var arrivalMinute = departureMinute + travelTimeInMinutes % 60

    arrivalHour += arrivalMinute / 60
    arrivalHour %= 24
    arrivalMinute %= 60

    print("Arrival time: ${String.format("%02d", arrivalHour)}:${String.format("%02d", arrivalMinute)}")
}