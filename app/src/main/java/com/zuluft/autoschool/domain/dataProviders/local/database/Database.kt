package com.zuluft.autoschool.domain.dataProviders.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.zuluft.autoschool.domain.dataProviders.local.database.daos.CharactersDao
import com.zuluft.autoschool.domain.models.CharacterModel


@Database(
    entities = [
        CharacterModel::class
    ],
    exportSchema = false,
    version = 1
)
abstract class Database :
    RoomDatabase() {
    abstract fun getCharactersDao(): CharactersDao
}