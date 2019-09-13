package com.zuluft.autoschool.domain.dataProviders.local.database.daos

import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.zuluft.autoschool.domain.models.CharacterModel

@Dao
interface CharactersDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(charactersList: List<CharacterModel>)

    @Query("SELECT * FROM characters")
    fun select(): DataSource.Factory<Int, CharacterModel>

}