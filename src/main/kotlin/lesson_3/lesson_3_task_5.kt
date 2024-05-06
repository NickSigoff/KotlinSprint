package org.example.lesson_3

fun main() {
    val dataDelimiter = ";"
    val pointsDelimiter = "-"

    val moveData = "D2-D4;0"
    val splitMoveData = moveData.split(pointsDelimiter,dataDelimiter)
    val pointFrom = splitMoveData[0]
    val pointTo = splitMoveData[1]
    val moveNumber = splitMoveData[2]

    println("Move: $moveNumber")
    println("From: $pointFrom")
    println("To: $pointTo")
}