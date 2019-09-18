package com.zuluft.autoschool.presentation.main

import com.zuluft.mvvm.viewModels.BaseViewModel


class MainViewModel :
    BaseViewModel<MainViewState>() {
    override fun getInitialState(): MainViewState {
        return InitialState
    }
}