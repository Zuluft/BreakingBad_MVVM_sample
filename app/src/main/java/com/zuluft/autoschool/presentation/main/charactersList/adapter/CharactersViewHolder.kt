package com.zuluft.autoschool.presentation.main.charactersList.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.facebook.drawee.view.SimpleDraweeView
import com.zuluft.autoschool.R
import com.zuluft.autoschool.domain.models.CharacterModel

class CharactersViewHolder(
    itemView: View
) :
    RecyclerView.ViewHolder(itemView) {

    private val tvCharName = itemView.findViewById<TextView>(R.id.tvCharName)
    private val ivCharImage = itemView.findViewById<SimpleDraweeView>(R.id.ivCharImage)

    fun apply(characterModel: CharacterModel) {
        tvCharName.text = characterModel.name
        ivCharImage.setImageURI(characterModel.image)
    }


}