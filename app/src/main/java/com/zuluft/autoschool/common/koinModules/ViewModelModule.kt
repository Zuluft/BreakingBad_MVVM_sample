package com.zuluft.autoschool.common.koinModules

import com.zuluft.autoschool.domain.models.dataModels.CharacterDetailsDataModel
import com.zuluft.autoschool.presentation.main.MainViewModel
import com.zuluft.autoschool.presentation.main.characterDetails.CharacterDetailsViewModel
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

    viewModel {
        CharactersListViewModel(get(), get())
    }

    viewModel { (characterDetailsDataMode: CharacterDetailsDataModel) ->
        CharacterDetailsViewModel(characterDetailsDataMode)
    }
}