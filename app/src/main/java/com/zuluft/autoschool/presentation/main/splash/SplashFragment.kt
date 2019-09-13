package com.zuluft.autoschool.presentation.main.splash

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import com.zuluft.autoschool.R
import com.zuluft.autoschool.common.annotations.LayoutResId
import com.zuluft.autoschool.common.base.BaseFragment
import com.zuluft.autoschool.domain.models.dataModels.HomeScreenDataModel
import org.koin.android.viewmodel.ext.android.viewModel

@LayoutResId(R.layout.fragment_splash)
class SplashFragment :
    BaseFragment<SplashViewState, SplashViewModel>() {

    private val splashViewModel: SplashViewModel by viewModel()


    override fun reflectState(viewState: SplashViewState) {
        viewState.goToHomeScreen.getValue().let {
            if (it != null && it) {
                findNavController().navigate(
                    SplashFragmentDirections
                        .actionSplashFragmentToHomeFragment(
                            HomeScreenDataModel("uuuu", "aaaa")
                        )
                )
            }
        }
    }

    override fun renderView(savedInstanceState: Bundle?) {

    }


    override fun provideViewModel(): SplashViewModel {
        return splashViewModel
    }
}