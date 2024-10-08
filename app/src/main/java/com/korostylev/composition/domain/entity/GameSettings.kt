package com.korostylev.composition.domain.entity

data class GameSettings(
    val maxSumValue: Int,
    val minCountOfRightAnswers: Int,
    val minPercentsOfRightAnswers: Int,
    val gameTimeInSeconds: Int
) {
}