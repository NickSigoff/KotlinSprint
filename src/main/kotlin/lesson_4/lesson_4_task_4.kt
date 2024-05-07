package org.example.lesson_4

fun main() {
    val numberOfTrainings = 5
    val isEvenTraining = numberOfTrainings % 2 == 0
    println(
        """
      Упражнения для рук:${!isEvenTraining}
      Упражнения для ног:${isEvenTraining}
      Упражнения для спины:${isEvenTraining}
      Упражнения для пресса:${!isEvenTraining}  
    """.trimIndent()
    )
}