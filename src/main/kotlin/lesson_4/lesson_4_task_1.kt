package org.example.lesson_4

const val NUMBER_OF_TABLES = 13
fun main() {
    val tablesBookedToday = 13
    val tablesBookedTomorrow = 9
    println("Доступность столиков на сегодня: ${NUMBER_OF_TABLES - tablesBookedToday > 0}\nДоступность столиков на завтра: ${NUMBER_OF_TABLES - tablesBookedTomorrow > 0}")


}