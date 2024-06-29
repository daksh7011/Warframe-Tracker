import io.ktor.client.HttpClient
import io.ktor.client.engine.java.Java

actual val httpClient: HttpClient
    get() = HttpClient(Java) {
        engine {
            pipelining = true
            protocolVersion = java.net.http.HttpClient.Version.HTTP_2
        }
    }