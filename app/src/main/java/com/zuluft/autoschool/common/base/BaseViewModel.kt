package com.zuluft.autoschool.common.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable


abstract class BaseViewModel<ViewState> :
    ViewModel() {

    private val liveViewState = MutableLiveData<ViewState>()

    protected val compositeDisposable = CompositeDisposable()

    private var currentState: ViewState? = null

    protected fun registerDisposable(vararg disposables: Disposable) {
        compositeDisposable.addAll(*disposables)
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
        compositeDisposable.clear()
    }

    fun dispatchAction(viewStateAction: ViewStateAction<ViewState>) {
        liveViewState.postValue(viewStateAction.newState(currentState ?: getInitialState()))
    }

    private fun sendState(state: ViewState) {
        this.currentState = state
        liveViewState.postValue(currentState!!)
    }

    protected abstract fun getInitialState(): ViewState

    fun getLiveViewState(): LiveData<ViewState> {
        return liveViewState
    }

}