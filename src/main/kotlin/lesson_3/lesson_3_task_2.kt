package org.example.lesson_3

fun main() {
    var personAge = 20
    var personName = "Татьяна"
    var personSurname = "Андреева"
    var personThirdName = "Сергеевна"

    println("$personSurname $personName $personThirdName $personAge")

    personSurname = "Сидорова"
    personAge = 22

    println("$personSurname $personName $personThirdName $personAge")
}