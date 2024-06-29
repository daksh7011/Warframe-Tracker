import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.utils.io.charsets.Charsets

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }

    suspend fun getApiResponse(): String {
        val response = httpClient.get("$BASE_URL/sortie")
        return response.bodyAsText(fallbackCharset = Charsets.UTF_8)
    }
}