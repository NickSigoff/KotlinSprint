package org.example.lesson_4

fun main() {
    val tablesNumber = 13
    val tablesBookedToday = 13
    val tablesBookedTomorrow = 9
    println("Доступность столиков на сегодня: ${tablesNumber - tablesBookedToday > 0}\nДоступность столиков на завтра: ${tablesNumber - tablesBookedTomorrow > 0}")


}