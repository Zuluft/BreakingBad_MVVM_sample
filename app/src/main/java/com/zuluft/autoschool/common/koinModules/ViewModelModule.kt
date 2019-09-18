package com.zuluft.autoschool.common.koinModules

import com.zuluft.autoschool.domain.models.dataModels.HomeScreenDataModel
import com.zuluft.autoschool.presentation.main.MainViewModel
import com.zuluft.autoschool.presentation.main.home.HomeViewModel
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

    viewModel { (homeScreenDataModel: HomeScreenDataModel) ->
        HomeViewModel(homeScreenDataModel, get(), get())
    }
}