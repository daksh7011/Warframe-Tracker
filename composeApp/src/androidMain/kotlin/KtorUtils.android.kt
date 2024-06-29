import io.ktor.client.HttpClient

actual val httpClient: HttpClient
    get() = HttpClient()