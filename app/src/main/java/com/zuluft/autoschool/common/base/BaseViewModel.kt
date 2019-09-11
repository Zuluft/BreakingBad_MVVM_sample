package com.zuluft.autoschool.common.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


abstract class BaseViewModel<ViewState> :
    ViewModel() {

    private val viewState = MutableLiveData<ViewState>()


    fun getViewState(): LiveData<ViewState> {
        return viewState
    }

}