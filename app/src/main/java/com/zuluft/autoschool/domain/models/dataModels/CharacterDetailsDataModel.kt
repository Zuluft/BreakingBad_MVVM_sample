package com.zuluft.autoschool.domain.models.dataModels

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CharacterDetailsDataModel(
    val characterId: Int,
    val characterName: String,
    val characterImage: String
) : Parcelable