package com.jdlstudios.programming.model

import com.jdlstudios.programming.util.MAX_CHARACTERS

data class ExerciseDetailModel(
    val id: Int,
    val title: String,
    val description: String,
    val difficulty: Int,
    val date: String,
    val time: String,
    val timeUser: String,
    val complete: Boolean
) {
    companion object {
        fun ExerciseDetailModel.mapToDetailFromExercise(): ExerciseModel {
            return ExerciseModel(
                id = id,
                title = title,
                description = shorterDescription(),
                difficult = difficulty,
                complete = complete,
                time = time
            )
        }
    }

    fun shorterDescription(): String {
        return if (description.length > MAX_CHARACTERS) {
            "${description.substring(0, MAX_CHARACTERS - 3)}..."
        } else {
            description
        }
    }

}