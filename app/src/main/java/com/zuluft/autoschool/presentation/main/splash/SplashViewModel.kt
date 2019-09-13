package com.zuluft.autoschool.presentation.main.splash

import com.zuluft.autoschool.common.base.BaseViewModel
import com.zuluft.autoschool.common.base.OneShotValue
import com.zuluft.autoschool.presentation.main.splash.actions.GoToHomeScreenAction
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit

class SplashViewModel :
    BaseViewModel<SplashViewState>() {
    override fun getInitialState(): SplashViewState {
        return SplashViewState(OneShotValue(false))
    }

    init {
        registerDisposable(
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