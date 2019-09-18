package com.zuluft.autoschool.domain.dataProviders.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.zuluft.autoschool.domain.dataProviders.local.database.daos.CharactersDao
import com.zuluft.autoschool.domain.models.CharacterModel
import com.zuluft.autoschool.domain.models.QuoteModel


@Database(
    entities = [
        CharacterModel::class,
        QuoteModel::class
    ],
    exportSchema = false,
    version = 2
)
abstract class Database :
    RoomDatabase() {
    abstract fun getCharactersDao(): CharactersDao
}