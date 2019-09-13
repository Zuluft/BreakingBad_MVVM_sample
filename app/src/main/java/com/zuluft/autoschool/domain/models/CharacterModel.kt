package com.zuluft.autoschool.domain.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.util.*

@Entity(tableName = "characters")
data class CharacterModel(
    @SerializedName("char_id")
    @PrimaryKey
    val id: Int,
    @SerializedName("name")
    val name: String,
//    @SerializedName("birthday")
//    val birthday: Date,
//    @SerializedName("occupation")
//    val occupation: List<String>,
    @SerializedName("img")
    val image: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("nickname")
    val nickname: String,
//    @SerializedName("appearance")
//    val appearance: List<Int>,
    @SerializedName("portrayed")
    val portrayed: String
)