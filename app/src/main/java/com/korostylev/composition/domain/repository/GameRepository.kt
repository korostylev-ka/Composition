package com.korostylev.composition.domain.repository

import com.korostylev.composition.domain.entity.GameSettings
import com.korostylev.composition.domain.entity.Level
import com.korostylev.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun  getGameSettings(level: Level): GameSettings
}