package org.example.lesson_2

import kotlin.math.floor

fun main() {
    val quantityMinedCrystals = 7
    val quantityMinedIron = 11

    val buffRatio = 0.2

    val additionalCrystalsWithBuff = (quantityMinedCrystals * buffRatio).toInt()
    val additionalIronWithBuff = (quantityMinedIron * buffRatio).toInt()

    print("Additional crystals with buff: $additionalCrystalsWithBuff\nAdditional iron with buff: $additionalIronWithBuff")
}