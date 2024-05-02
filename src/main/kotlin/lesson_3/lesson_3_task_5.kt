package org.example.lesson_3

fun main() {
    val dataDelimiter = ";"
    val pointsDelimiter = "-"

    val moveData = "D2-D4;0"
    val splitMoveData = moveData.split(dataDelimiter)
    val moveNumber = splitMoveData[1]
    val movePoints = splitMoveData[0].split(pointsDelimiter)
    val pointFrom = movePoints[0]
    val pointTo = movePoints[1]

    println("Move: $moveNumber")
    println("From: $pointFrom")
    println("To: $pointTo")
}