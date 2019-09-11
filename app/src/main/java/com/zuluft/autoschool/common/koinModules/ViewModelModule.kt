package com.zuluft.autoschool.common.koinModules

import com.zuluft.autoschool.presentation.main.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelModule = module {
    viewModel { (id: Int) ->
        MainViewModel(id)
    }
}