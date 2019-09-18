package com.zuluft.autoschool.presentation.main.home

import android.util.Log
import androidx.paging.RxPagedListBuilder
import com.zuluft.autoschool.domain.models.dataModels.HomeScreenDataModel
import com.zuluft.autoschool.domain.useCases.FetchAndSaveCharactersUseCase
import com.zuluft.autoschool.domain.useCases.GetCharactersUseCase
import com.zuluft.autoschool.presentation.main.home.actions.DrawDataAction
import com.zuluft.mvvm.viewModels.BaseViewModel

class HomeViewModel
constructor(
    homeScreenDataModel: HomeScreenDataModel,
    getCharactersUseCase: GetCharactersUseCase,
    fetchAndSaveCharactersUseCase: FetchAndSaveCharactersUseCase
) :
    BaseViewModel<HomeViewState>() {
    override fun getInitialState(): HomeViewState {
        return HomeViewState()
    }

    init {
        Log.d("zulufta", homeScreenDataModel.username)
        registerDisposables(
            RxPagedListBuilder(getCharactersUseCase.start(), 5)
                .setBoundaryCallback(
                    BoundaryCallback(
                        compositeDisposable,
                        fetchAndSaveCharactersUseCase
                    )
                ).buildObservable()
                .subscribe {
                    dispatchAction(DrawDataAction(it))
                })
    }
}