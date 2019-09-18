package com.zuluft.autoschool.domain.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "quotes")
data class QuoteModel(
    @PrimaryKey
    @SerializedName("quote_id")
    val id: Int,
    @SerializedName("quote")
    val quoteText: String,
    @SerializedName("author")
    val author: String
)