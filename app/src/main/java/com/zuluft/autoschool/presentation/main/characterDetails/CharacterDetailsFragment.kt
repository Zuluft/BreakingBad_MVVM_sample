package com.zuluft.autoschool.presentation.main.characterDetails

import android.os.Bundle
import androidx.navigation.fragment.navArgs
import com.zuluft.autoschool.R
import com.zuluft.mvvm.common.LayoutResId
import com.zuluft.mvvm.fragments.BaseFragment
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

@LayoutResId(R.layout.fragment_character_details)
class CharacterDetailsFragment :
    BaseFragment<CharacterDetailsViewState, CharacterDetailsViewModel>() {


    private val characterDetailsViewModel: CharacterDetailsViewModel by viewModel {
        parametersOf(
            CharacterDetailsFragmentArgs.fromBundle(arguments!!)
                .characterDetailsDataModel
        )
    }

    override fun provideViewModel(): CharacterDetailsViewModel {
        return characterDetailsViewModel
    }

    override fun reflectState(viewState: CharacterDetailsViewState) {

    }

    override fun renderView(savedInstanceState: Bundle?) {

    }
}