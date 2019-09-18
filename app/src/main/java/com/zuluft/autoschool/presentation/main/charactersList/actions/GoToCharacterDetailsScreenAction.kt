package com.zuluft.autoschool.presentation.main.charactersList.actions

import com.zuluft.autoschool.domain.models.dataModels.CharacterDetailsDataModel
import com.zuluft.autoschool.presentation.main.charactersList.CharactersListViewState
import com.zuluft.mvvm.actions.ViewStateAction
import com.zuluft.mvvm.models.DisposableValue

class GoToCharacterDetailsScreenAction(
    private val characterDetailsDataModel:
    CharacterDetailsDataModel
) :
    ViewStateAction<CharactersListViewState> {
    override fun newState(oldState: CharactersListViewState): CharactersListViewState {
        return oldState.copy(
            goToCharacterDetailsScreen =
            DisposableValue(characterDetailsDataModel)
        )
    }
}