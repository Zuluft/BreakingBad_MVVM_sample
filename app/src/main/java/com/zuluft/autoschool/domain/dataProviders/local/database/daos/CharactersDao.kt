package com.zuluft.autoschool.domain.dataProviders.local.database.daos

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.zuluft.autoschool.domain.models.CharacterModel


interface CharactersDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(charactersList: List<CharacterModel>)

}