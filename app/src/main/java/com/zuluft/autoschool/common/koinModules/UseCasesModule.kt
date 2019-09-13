package com.zuluft.autoschool.common.koinModules

import com.zuluft.autoschool.domain.useCases.FetchAndSaveCharactersUseCase
import com.zuluft.autoschool.domain.useCases.FetchCharactersUseCase
import com.zuluft.autoschool.domain.useCases.GetCharactersUseCase
import com.zuluft.autoschool.domain.useCases.SaveCharactersUseCase
import org.koin.dsl.module

val useCasesModule = module {
    factory {
        FetchCharactersUseCase(get())
    }

    factory {
        SaveCharactersUseCase(get())
    }

    factory {
        FetchAndSaveCharactersUseCase(
            get(),
            get(),
            get()
        )
    }

    factory {
        GetCharactersUseCase(get())
    }
}