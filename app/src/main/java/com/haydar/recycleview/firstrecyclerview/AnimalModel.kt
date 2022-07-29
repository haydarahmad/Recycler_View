package com.haydar.recycleview.firstrecyclerview

import android.content.Context
import com.haydar.recycleview.R

class AnimalModel(val context: Context){
    fun getAnimalList() : Array<String>{
        return context.resources.getStringArray(R.array.animalList)
    }

}