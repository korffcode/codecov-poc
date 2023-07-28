import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class SeasonsAverageTest {
    private val testSeasonsAverage: SeasonsAverage = SeasonsAverage()

	private val testString: String =
        """
            {
                "__typename" : "ChampionshipGame",
                "bracketId" : 201,
                "gameState" : "P",
                "startDate" : "",
                "homeTeamName" : "Reds",
                "awayTeamName" : "Cubs",
                "homeTeamScore" : 35,
                "awayTeamScore" : 0,
				"stadium" : "Riverfront"
            }
        """

    @Test
    fun testGetBracketID() {
        val expected = 201

        assertEquals(expected, testSeasonsAverage.getBracketId(testString))
    }

    @Test
    fun testGetGameState() {
        val expected = "P"

        assertEquals(expected, testSeasonsAverage.getGameState(testString))
    }

    @Test
    fun testGetStartDate() {
        val expected = ""

        assertEquals(expected, testSeasonsAverage.getStartDate(testString))
    }

    @Test
    fun testGetHomeTeamName() {
        val expected = "Reds"

        assertEquals(expected, testSeasonsAverage.getHomeTeamName(testString))
    }

    @Test
    fun testGetAwayTeamName() {
        val expected = "Cubs"

        assertEquals(expected, testSeasonsAverage.getAwayTeamName(testString))
    }

    @Test
    fun testGetHomeTeamScore() {
        val expected = 35

        assertEquals(expected, testSeasonsAverage.getHomeTeamScore(testString))
    }

    @Test
    fun testGetAwayTeamScore() {
        val expected = 0

        assertEquals(expected, testSeasonsAverage.getAwayTeamScore(testString))
    }

    @Test
    fun testGetTypename() {
        val expected = "ChampionshipGame"

        assertEquals(expected, testSeasonsAverage.getTypename(testString))
    }

    @Test
    fun testGetStadium() {
        val expected = "Riverfront"

        assertEquals(expected, testSeasonsAverage.getStadium(testString))
    }

    @Test
    fun testMain() {
        assertEquals(Unit, main(arrayOf(
                "__typename",
                "bracketId",
                "gameState",
                "startDate",
                "homeTeamName",
                "awayTeamName",
                "homeTeamScore",
                "awayTeamScore"
        )))
    }
}
