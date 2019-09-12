package com.zuluft.autoschool.common.base

interface ViewStateAction<ViewState> {

    fun newState(oldState: ViewState): ViewState
}