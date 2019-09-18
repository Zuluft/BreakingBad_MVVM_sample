package com.zuluft.autoschool.presentation.main.characterDetails

import androidx.lifecycle.ViewModel
import com.zuluft.autoschool.domain.models.dataModels.CharacterDetailsDataModel
import com.zuluft.mvvm.viewModels.BaseViewModel

class CharacterDetailsViewModel
constructor(private val characterDetailsDataModel: CharacterDetailsDataModel) :
    BaseViewModel<CharacterDetailsViewState>() {

    override fun getInitialState(): CharacterDetailsViewState {
        return CharacterDetailsViewState()
    }
}