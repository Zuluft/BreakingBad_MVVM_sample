package com.zuluft.autoschool.presentation.main.splash.actions

import com.zuluft.autoschool.domain.models.dataModels.CharactersListScreenDataModel
import com.zuluft.autoschool.presentation.main.splash.SplashViewState
import com.zuluft.mvvm.actions.ViewStateAction
import com.zuluft.mvvm.models.DisposableValue

class GoToHomeScreenAction
constructor(private val charactersListScreenDataModel: CharactersListScreenDataModel) :
    ViewStateAction<SplashViewState> {
    override fun newState(oldState: SplashViewState): SplashViewState {
        return oldState.copy(goToCharactersListScreen = DisposableValue(charactersListScreenDataModel))
    }
}