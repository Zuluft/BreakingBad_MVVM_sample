package com.zuluft.autoschool.presentation.main.splash

import com.zuluft.autoschool.common.base.BaseViewModel

class SplashViewModel :
    BaseViewModel<SplashViewState>() {
    override fun getInitialState(): SplashViewState {
        return SplashViewState
    }
}