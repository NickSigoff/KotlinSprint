package org.example.lesson_2

fun main() {
    val studentAssessments: Array<Int> = arrayOf(3, 4, 3, 5)
    val averageAssessment: Double = calculateAverage(studentAssessments)
    println("Average assessment: ${String.format("%.2f", averageAssessment)}")
}

fun calculateAverage(studentAssessments: Array<Int>): Double {
    var sum = 0

    for (assessment in studentAssessments) {
        sum += assessment
    }

    return sum.toDouble() / studentAssessments.size
}
