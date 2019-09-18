package com.zuluft.autoschool.common.koinModules

import com.zuluft.autoschool.domain.models.dataModels.CharactersListScreenDataModel
import com.zuluft.autoschool.presentation.main.MainViewModel
import com.zuluft.autoschool.presentation.main.charactersList.CharactersListViewModel
import com.zuluft.autoschool.presentation.main.splash.SplashViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelModule = module {
    viewModel {
        MainViewModel()
    }

    viewModel {
        SplashViewModel()
    }

    viewModel { (charactersListScreenDataModel: CharactersListScreenDataModel) ->
        CharactersListViewModel(charactersListScreenDataModel, get(), get())
    }
}