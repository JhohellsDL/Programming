package com.jdlstudios.programming.model

data class ExerciseModel(
    val id: Int,
    val title: String,
    val description: String
) {
    companion object {
        fun mapToExerciseFromDetail(item: ExerciseDetailModel): ExerciseModel {
            return ExerciseModel(
                id = item.id,
                title = item.title,
                description = item.shorterDescription()
            )
        }
    }
}
