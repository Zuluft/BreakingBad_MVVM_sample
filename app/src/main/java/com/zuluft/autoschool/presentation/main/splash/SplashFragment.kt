package com.zuluft.autoschool.presentation.main.splash

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import com.zuluft.autoschool.R
import com.zuluft.mvvm.common.LayoutResId
import com.zuluft.mvvm.fragments.BaseFragment
import org.koin.android.viewmodel.ext.android.viewModel

@LayoutResId(R.layout.fragment_splash)
class SplashFragment :
    BaseFragment<SplashViewState, SplashViewModel>() {

    private val splashViewModel: SplashViewModel by viewModel()

    override fun reflectState(viewState: SplashViewState) {
        viewState.goToCharactersListScreen?.getValue()?.also {
            findNavController().navigate(
                SplashFragmentDirections
                    .actionSplashFragmentToCharactersListFragment()
            )
        }
    }

    override fun provideViewModel(): SplashViewModel {
        return splashViewModel
    }

    override fun renderView(savedInstanceState: Bundle?) {

    }
}


