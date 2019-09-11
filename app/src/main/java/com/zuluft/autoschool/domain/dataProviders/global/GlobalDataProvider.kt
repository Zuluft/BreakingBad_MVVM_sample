package com.zuluft.autoschool.domain.dataProviders.global

import com.zuluft.autoschool.domain.models.CharacterModel
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query


interface GlobalDataProvider {

    @GET("characters")
    fun getCharacters(@Query("limit") limit: Int, @Query("offset") offset: Int):
            Observable<List<CharacterModel>>

}