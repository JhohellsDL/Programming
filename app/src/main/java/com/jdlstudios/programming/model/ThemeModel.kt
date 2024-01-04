package com.jdlstudios.programming.model

data class ThemeModel(
    val id: Int,
    val title: String,
    val shortDescription: String,
    val description: String,
    val difficult: Int,
    val timeEstimated: String,
    val image: Int,
    val complete: Boolean
)