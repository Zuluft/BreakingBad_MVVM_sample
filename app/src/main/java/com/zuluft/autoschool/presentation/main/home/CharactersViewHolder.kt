package com.zuluft.autoschool.presentation.main.home

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zuluft.autoschool.R
import com.zuluft.autoschool.domain.models.CharacterModel

class CharactersViewHolder(itemView: View) :
    RecyclerView.ViewHolder(itemView) {

    private val tvName = itemView.findViewById<TextView>(R.id.tvName)

    fun apply(characterModel: CharacterModel) {
        tvName.text = characterModel.name
    }


}