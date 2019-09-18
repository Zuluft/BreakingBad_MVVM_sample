package com.zuluft.autoschool.domain.models.dataModels

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CharactersListScreenDataModel(
    val username: String,
    val password: String
) : Parcelable