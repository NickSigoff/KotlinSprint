package org.example.lesson_2

import kotlin.math.floor

fun main() {
    val quantityMinedCrystals = 7
    val quantityMinedIron = 11

    val buffRatio = 20
    val buffRatioForCalculations: Double = buffRatio / 100.0
    val additionalCrystalsWithBuff = (quantityMinedCrystals * buffRatioForCalculations).toInt()
    val additionalIronWithBuff = (quantityMinedIron * buffRatioForCalculations).toInt()

    print("Additional crystals with buff: $additionalCrystalsWithBuff\nAdditional iron with buff: $additionalIronWithBuff")
}