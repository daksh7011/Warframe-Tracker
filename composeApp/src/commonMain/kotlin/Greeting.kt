import data.Fissures
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.utils.io.charsets.Charsets

class Greeting {
    private val platform = getPlatform()

    suspend fun getSortieData(): String {
        val response = httpClient.get("$BASE_URL/sortie")
        return response.bodyAsText(fallbackCharset = Charsets.UTF_8)
    }

    suspend fun getNightwaveData(): String {
        val response = httpClient.get("$BASE_URL/nightwave")
        return response.bodyAsText(fallbackCharset = Charsets.UTF_8)
    }

    suspend fun getFissuresData(): List<Fissures> {
        return httpClient.get("$BASE_URL/fissures").body()
    }
}