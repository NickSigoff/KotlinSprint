package org.example.lesson_3

fun main() {
    val variableToMultiply = 2
    print(
        """
        $variableToMultiply x 1 = ${variableToMultiply * 1}
        $variableToMultiply x 2 = ${variableToMultiply * 2}
        $variableToMultiply x 3 = ${variableToMultiply * 3}
        $variableToMultiply x 4 = ${variableToMultiply * 4}
        $variableToMultiply x 5 = ${variableToMultiply * 5}
        $variableToMultiply x 6 = ${variableToMultiply * 6}
        $variableToMultiply x 7 = ${variableToMultiply * 7}
        $variableToMultiply x 8 = ${variableToMultiply * 8}
        $variableToMultiply x 9 = ${variableToMultiply * 9}
    """.trimIndent()
    )
}