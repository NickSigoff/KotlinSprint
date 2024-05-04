package org.example.lesson_5

fun main() {
    val userName = "Zaphod"
    val userPassword = "PanGalactic"
    println("Введите имя пользователя:")
    val userNameInput = readln()
    if (userNameInput == userName) {
        println("Введите пароль:")
        val userPasswordInput = readln()
        if (userPasswordInput == userPassword) {
            println(
                """[вздыхает...]
 Ваши данные проверены, и о, чудо, они верны... 
 Пользователь "Zaphod", вам разрешено входить на борт корабля "Heart of Gold".
 Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов...
 [меланхолический вздох...]
 Надеюсь, вам понравится пребывание здесь больше, чем мне.""".trimIndent()
            )
        } else {
            println("Неверный пароль")
        }
    } else {
        println("Такого пользователя не существует. Пожалуйста, зарегистрируйте нового пользователя.")
    }
}