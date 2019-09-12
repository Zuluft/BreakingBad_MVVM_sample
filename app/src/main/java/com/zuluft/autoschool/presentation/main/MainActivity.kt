package com.zuluft.autoschool.presentation.main

import android.os.Bundle
import com.zuluft.autoschool.R
import com.zuluft.autoschool.common.annotations.LayoutResId
import com.zuluft.autoschool.common.base.BaseActivity
import com.zuluft.autoschool.presentation.main.splash.SplashFragment
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

@LayoutResId(R.layout.activity_main)
class MainActivity :
    BaseActivity<MainViewState, MainViewModel>() {

    private val mainViewModel: MainViewModel by viewModel {
        parametersOf(4)
    }

    override fun reflectState(viewState: MainViewState) {

    }

    override fun renderView(savedInstanceState: Bundle?) {
        supportFragmentManager.beginTransaction().add(android.R.id.content, SplashFragment())
            .commit()
    }

    override fun provideViewModel(): MainViewModel {
        return mainViewModel
    }

}
