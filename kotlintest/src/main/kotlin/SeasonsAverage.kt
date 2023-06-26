import kotlinx.serialization.*
import kotlinx.serialization.json.Json

@Serializable
data class SeasonsAverageModel(	val __typename: String,
                            val bracketId: Int,
                            val gameState: String,
                            val startDate: String)

class SeasonsAverage {
    fun getGameState(seasonsAverage: String): String {
        val seasonsAverageObj = Json.decodeFromString<SeasonsAverageModel>(seasonsAverage)

        return seasonsAverageObj.gameState
    }

    fun getStartDate(seasonsAverage: String): String {
        val seasonsAverageObj = Json.decodeFromString<SeasonsAverageModel>(seasonsAverage)

        return seasonsAverageObj.startDate
    }

    fun getBracketId(seasonsAverage: String): Int {
        val seasonsAverageObj = Json.decodeFromString<SeasonsAverageModel>(seasonsAverage)

        return seasonsAverageObj.bracketId
    }
}