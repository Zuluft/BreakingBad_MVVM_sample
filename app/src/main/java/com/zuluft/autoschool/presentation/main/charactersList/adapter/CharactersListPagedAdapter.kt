package com.zuluft.autoschool.presentation.main.charactersList.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import com.zuluft.autoschool.R
import com.zuluft.autoschool.domain.models.CharacterModel

class CharactersListPagedAdapter :
    PagedListAdapter<CharacterModel, CharactersViewHolder>(
        config
    ) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactersViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_character,
                parent, false
            )
        return CharactersViewHolder((view))
    }

    override fun onBindViewHolder(holder: CharactersViewHolder, position: Int) {
        val item= getItem(position)
        if(item!=null)
        holder.apply(item)
    }

    companion object {
        val config = object : DiffUtil.ItemCallback<CharacterModel>() {
            override fun areItemsTheSame(
                oldItem: CharacterModel,
                newItem: CharacterModel
            ): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(
                oldItem: CharacterModel,
                newItem: CharacterModel
            ): Boolean {
                return oldItem.name == newItem.name
            }

        }
    }
}