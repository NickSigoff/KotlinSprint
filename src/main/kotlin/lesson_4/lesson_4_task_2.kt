package org.example.lesson_4

fun main() {
    var cargoWeight = 20
    var cargoVolume = 80
    printDecisionMessage(cargoWeight, cargoVolume)
    cargoWeight = 50
    cargoVolume = 100
    printDecisionMessage(cargoWeight, cargoVolume)
}

fun printDecisionMessage(cargoWeight: Int, cargoVolume: Int) {
    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': ${cargoWeight >= 35 && cargoWeight <= 100 && cargoVolume < 100}")
}
