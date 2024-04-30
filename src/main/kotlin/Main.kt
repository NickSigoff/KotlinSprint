package org.example

fun main() {
    val year = 1961
    var hour = 9
    var minute = 7
    println(
        """
      The spacecraft «Vostok» was launched
      $year year
      $hour hours
      $minute minutes
    """.trimIndent()
    )

    val flightTimeInMinutes = 108
    hour += flightTimeInMinutes / 60
    minute += flightTimeInMinutes % 60

    println("The spacecraft landed at $hour:$minute")

}