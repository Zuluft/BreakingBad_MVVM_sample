package com.zuluft.autoschool.presentation.main

import com.zuluft.autoschool.common.base.BaseViewModel


class MainViewModel:
    BaseViewModel<MainViewState>() {
    override fun getInitialState(): MainViewState {
        return InitialState
    }
}