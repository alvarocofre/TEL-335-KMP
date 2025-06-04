package cl.usm.tel335

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import cl.usm.tel335.model.Greeting
import cl.usm.tel335.model.QuestionDto
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import questionapp.composeapp.generated.resources.Res
import questionapp.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {
        val sampleQuestion = QuestionDto(
            id = 1,
            text = "Cual es la capital de Chile?",
            category = "Geografía"
        )

        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(sampleQuestion.text, fontSize = 32.sp, fontWeight = FontWeight.Bold)
            Text(sampleQuestion.category)
        }

    }
}