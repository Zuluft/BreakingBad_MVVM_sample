package com.zuluft.autoschool.presentation.main.splash.actions

import com.zuluft.autoschool.common.base.OneShotValue
import com.zuluft.autoschool.common.base.ViewStateAction
import com.zuluft.autoschool.presentation.main.splash.SplashViewState

class GoToHomeScreenAction :
    ViewStateAction<SplashViewState> {
    override fun newState(oldState: SplashViewState): SplashViewState {
        return oldState.copy(goToHomeScreen = OneShotValue(true))
    }
}