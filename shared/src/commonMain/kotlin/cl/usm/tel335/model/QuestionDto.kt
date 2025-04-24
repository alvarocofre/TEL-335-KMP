package cl.usm.tel335.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class QuestionDto(
    @SerialName("id")
    val id: Long = -1,
    @SerialName("text")
    val text: String,
    @SerialName("category")
    val category: String //TODO: crear clase category
)