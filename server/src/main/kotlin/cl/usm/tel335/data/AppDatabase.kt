package cl.usm.tel335.data

import cl.usm.tel335.database.Database
import cl.usm.tel335.database.Question
import cl.usm.tel335.model.QuestionDto

internal class AppDatabase(driverFactory: DriverFactory){
    private val dataBase = Database(driverFactory.createDriver())
    private val questionQueries = dataBase.questionQueries

    internal fun getAllQuestions(): List<QuestionDto> {
        val questionsDto = questionQueries.selectAll().executeAsList().map { it.toDTO() }
        return questionsDto
    }

    private fun Question.toDTO() = QuestionDto(id = this.id, text = this.text, category = this.category)

}