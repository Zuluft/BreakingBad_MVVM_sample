package com.zuluft.autoschool.presentation.main.splash

import com.zuluft.autoschool.presentation.main.splash.actions.GoToHomeScreenAction
import com.zuluft.mvvm.viewModels.BaseViewModel
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit

class SplashViewModel :
    BaseViewModel<SplashViewState>() {
    override fun getInitialState(): SplashViewState {
        return SplashViewState()
    }

    init {
        registerDisposables(
            Observable.fromCallable {
                GoToHomeScreenAction()
            }
                .delay(3, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::dispatchAction)
        )
    }
}