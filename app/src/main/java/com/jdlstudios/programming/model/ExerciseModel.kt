package com.jdlstudios.programming.model

import com.jdlstudios.programming.util.Difficult

data class ExerciseModel(
    val id: Int,
    val title: String,
    val description: String,
    val difficult: Int,
    val complete: Boolean,
    val time: String
) {
    companion object {
        fun mapToExerciseFromDetail(item: ExerciseDetailModel): ExerciseModel {
            return ExerciseModel(
                id = item.id,
                title = item.title,
                description = item.shorterDescription(),
                difficult = item.difficulty,
                complete = item.complete,
                time = item.timeUser
            )
        }
    }
}
