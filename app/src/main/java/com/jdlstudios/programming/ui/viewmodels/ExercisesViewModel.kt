package com.jdlstudios.programming.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jdlstudios.programming.model.ExerciseModel

class ExercisesViewModel: ViewModel() {

    private var _currentListExercises = MutableLiveData<List<ExerciseModel>>()
    val currentListExercises: LiveData<List<ExerciseModel>> = _currentListExercises

    fun setListExercises(list: List<ExerciseModel>) {
        list.let {
            _currentListExercises.postValue(list)
        }
    }
}