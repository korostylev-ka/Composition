package com.korostylev.composition.domain.usecases

import com.korostylev.composition.domain.entity.GameSettings
import com.korostylev.composition.domain.entity.Level
import com.korostylev.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)

    }
}