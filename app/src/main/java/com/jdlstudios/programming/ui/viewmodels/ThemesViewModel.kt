package com.jdlstudios.programming.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jdlstudios.programming.model.ThemeModel

class ThemesViewModel: ViewModel() {

    private var _currentListThemes = MutableLiveData<List<ThemeModel>>()
    val currentListThemes: LiveData<List<ThemeModel>> = _currentListThemes

    fun setListThemes(listThemes: List<ThemeModel>) {
        listThemes.let {
            _currentListThemes.postValue(listThemes)
        }
    }

}