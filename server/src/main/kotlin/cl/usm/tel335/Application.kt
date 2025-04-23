package cl.usm.tel335

import cl.usm.tel335.model.questions
import io.ktor.http.HttpStatusCode
import io.ktor.serialization.kotlinx.json.json
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.ContentNegotiation
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
    embeddedServer(Netty, port = SERVER_PORT, host = "127.0.0.1", module = Application::module)
        .start(wait = true)
}

fun Application.module() {

    configureSerialization()

    routing {
        get("/") {
            call.respondText("Hola curso de TEL335 :) !!")
        }

        get("/questions") {
            call.respond(status = HttpStatusCode.OK, questions)
        }
    }
}

fun Application.configureSerialization(){
    install(ContentNegotiation){
        json()
    }
}