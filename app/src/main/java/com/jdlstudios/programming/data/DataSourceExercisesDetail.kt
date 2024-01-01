package com.jdlstudios.programming.data

import com.jdlstudios.programming.model.ExerciseDetailModel
import com.jdlstudios.programming.model.ExerciseDetailModel.Companion.mapToDetailFromExercise
import com.jdlstudios.programming.model.ExerciseModel

object DataSourceExercisesDetail {
    fun getExerciseDetail(idTheme: Int, idExercise: Int): ExerciseDetailModel? {
        val exerciseListMap = mapOf(
            100 to listExercisesDetail100,
            200 to listExercisesDetail200
        )
        return exerciseListMap[idTheme]?.find { it.id == idExercise }
    }

    fun getListExercisesSummary(idTheme: Int): List<ExerciseModel> {
        val exerciseList: MutableList<ExerciseModel> = mutableListOf()
        val exerciseDetailList = when (idTheme) {
            100 -> listExercisesDetail100
            200 -> listExercisesDetail200
            else -> emptyList()
        }
        exerciseDetailList.forEach {
            exerciseList.add(it.mapToDetailFromExercise())
        }
        return exerciseList
    }

    val listExercisesDetail100: List<ExerciseDetailModel> = listOf(
        ExerciseDetailModel(
            id = 101,
            title = "Declara variables",
            description = "Declara dos variables llamadas numero1 y numero2 y asígnales valores enteros. Luego, imprime la suma de ambos.",
            difficulty = "Fácil",
            date = "2023-01-01",
            time = "10:00 AM",
            timeUser = "30 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 102,
            title = "Saludo",
            description = "Crea una variable llamada nombre y asígnale tu nombre. Imprime un saludo personalizado.",
            difficulty = "Fácil",
            date = "2023-01-02",
            time = "02:30 PM",
            timeUser = "45 min",
            complete = true
        )

    )

    val listExercisesDetail200: List<ExerciseDetailModel> = listOf(
        ExerciseDetailModel(
            id = 201,
            title = "Declara variables 2 ",
            description = "Declara dos variables llamadas numero1 y numero2 y asígnales valores enteros. Luego, imprime la suma de ambos.",
            difficulty = "Fácil",
            date = "2023-01-01",
            time = "10:00 AM",
            timeUser = "30 min",
            complete = false
        ),
        ExerciseDetailModel(
            id = 202,
            title = "Saludo 2 ",
            description = "Crea una variable llamada nombre y asígnale tu nombre. Imprime un saludo personalizado.",
            difficulty = "Fácil",
            date = "2023-01-02",
            time = "02:30 PM",
            timeUser = "45 min",
            complete = true
        )

    )

}