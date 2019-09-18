package com.zuluft.autoschool.presentation.main.characterDetails

import com.zuluft.autoschool.domain.models.CharacterModel
import com.zuluft.autoschool.domain.models.QuoteModel


data class CharacterDetailsViewState(
    val characterModel: CharacterModel? = null,
    val quoteModels: List<QuoteModel>? = null
)