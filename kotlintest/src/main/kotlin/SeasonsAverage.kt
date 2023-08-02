import kotlinx.serialization.*
import kotlinx.serialization.json.Json

@Serializable
data class SeasonsAverageModel(val __typename: String,
                            val bracketId: Int,
                            val gameState: String,
                            val startDate: String,
                            val homeTeamName: String,
                            val awayTeamName: String,
                            val homeTeamScore: Int,
                            val awayTeamScore: Int,
                            val stadium: String)

// Comment to modify source code to see if that unblocks PR

class SeasonsAverage {
    fun getTypename(seasonsAverage: String): String {
        val seasonsAverageObj = Json.decodeFromString<SeasonsAverageModel>(seasonsAverage)

        return seasonsAverageObj.__typename
    }

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

    fun getHomeTeamName(seasonsAverage: String): String {
        val seasonsAverageObj = Json.decodeFromString<SeasonsAverageModel>(seasonsAverage)

        return seasonsAverageObj.homeTeamName
    }

    fun getAwayTeamName(seasonsAverage: String): String {
        val seasonsAverageObj = Json.decodeFromString<SeasonsAverageModel>(seasonsAverage)

        return seasonsAverageObj.awayTeamName
    }

    fun getHomeTeamScore(seasonsAverage: String): Int {
        val seasonsAverageObj = Json.decodeFromString<SeasonsAverageModel>(seasonsAverage)

        return seasonsAverageObj.homeTeamScore
    }

    fun getAwayTeamScore(seasonsAverage: String): Int {
        val seasonsAverageObj = Json.decodeFromString<SeasonsAverageModel>(seasonsAverage)

        return seasonsAverageObj.awayTeamScore
    }

    fun getStadium(seasonsAverage: String): String {
        val seasonsAverageObj = Json.decodeFromString<SeasonsAverageModel>(seasonsAverage)

        return seasonsAverageObj.stadium
    }
}
