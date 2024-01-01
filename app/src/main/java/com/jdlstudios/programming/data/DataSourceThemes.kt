package com.jdlstudios.programming.data

import com.jdlstudios.programming.model.ExerciseModel
import com.jdlstudios.programming.model.ThemeModel

object DataSourceThemes {

    val themeList: List<ThemeModel> = listOf(
        ThemeModel("Tema 1", "Descripción del tema 1"),
        ThemeModel("Tema 2", "Descripción del tema 2"),
        // Agregar más temas según sea necesario
    )

    val exerciseList: List<ExerciseModel> = listOf(
        ExerciseModel(
            title = "Exercise 1",
            description = "Description exercise 1"
        ),
        ExerciseModel(
            title = "Exercise 2",
            description = "Description exercise 2"
        ),
        ExerciseModel(
            title = "Exercise 3",
            description = "Description exercise 3"
        )
    )
}