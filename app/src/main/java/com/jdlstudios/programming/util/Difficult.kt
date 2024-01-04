package com.jdlstudios.programming.util

enum class Difficult(val description: String) {
    EASY("Easy"),
    MIDDLE("Middle"),
    HARD("Hard"),
    EXPERT("Expert");

    companion object {
        private fun getDifficult(id: Int): Difficult? {
            return entries.getOrNull(id)
        }

        fun getDifficultName(id: Int): String {
            return getDifficult(id)?.description ?: "No especificado"
        }
    }
}