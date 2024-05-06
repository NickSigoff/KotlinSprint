package org.example.lesson_3

fun main() {
    var personAge = 20
    val personName = "Татьяна"
    var personSurname = "Андреева"
    val personThirdName = "Сергеевна"

    println("$personSurname $personName $personThirdName $personAge")

    personSurname = "Сидорова"
    personAge = 22

    println("$personSurname $personName $personThirdName $personAge")
}