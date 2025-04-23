package cl.usm.tel335.model

import kotlinx.serialization.Serializable

val questions = mutableListOf(
    Question(
        id = 1,
        text = "¿Cuál es la capital de Francia?",
        category = "Geografía",
    ),
    Question(
        id = 2,
        text = "¿Quién escribió 'Cien años de soledad'?",
        category = "Literatura",
    ),
    Question(
        id = 3,
        text = "¿Cuál es el resultado de 9 x 7?",
        category = "Matemáticas"
    )
)

@Serializable
data class Question(
    val id: Long = -1,
    val text: String,
    val category: String
)