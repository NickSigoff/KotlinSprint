package org.example.lesson_1

fun main() {
    val secondsInSpace = 6480
    val timeHHMMSS = convertSecondsToHHMMSS(secondsInSpace)

    print("Total time spent in space: $timeHHMMSS")
}

fun convertSecondsToHHMMSS(seconds: Int): String {
    val minutes = seconds / 60
    val hours = minutes / 60
    val secondsRemainder = seconds % 60
    val minutesRemainder = minutes % 60

    return String.format("%02d:%02d:%02d", hours, minutesRemainder, secondsRemainder)
}