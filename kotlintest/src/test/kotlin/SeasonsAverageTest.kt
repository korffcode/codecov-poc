import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class SeasonsAverageTest {
    private val testSeasonsAverage: SeasonsAverage = SeasonsAverage()

    @Test
    fun testGetBracketID() {
        val expected = 201

        assertEquals(expected, testSeasonsAverage.getBracketId("""
            {
                "__typename" : "ChampionshipGame",
                "bracketId" : 201,
                "gameState" : "P",
                "startDate" : "",
                "homeTeamName" : "Reds",
                "awayTeamName" : "Cubs",
				"homeTeamScore" : 35,
				"awayTeamScore" : 0
            }
        """))
    }

    @Test
    fun testGetGameState() {
        val expected = "P"

        assertEquals(expected, testSeasonsAverage.getGameState("""
            {
                "__typename" : "ChampionshipGame",
                "bracketId" : 201,
                "gameState" : "P",
                "startDate" : "",
                "homeTeamName" : "Reds",
                "awayTeamName" : "Cubs",
				"homeTeamScore" : 35,
				"awayTeamScore" : 0
            }
        """))
    }

    @Test
    fun testGetStartDate() {
        val expected = ""

        assertEquals(expected, testSeasonsAverage.getStartDate("""
            {
                "__typename" : "ChampionshipGame",
                "bracketId" : 201,
                "gameState" : "P",
                "startDate" : "",
                "homeTeamName" : "Reds",
                "awayTeamName" : "Cubs",
				"homeTeamScore" : 35,
				"awayTeamScore" : 0
            }
        """))
    }

    @Test
    fun testGetHomeTeamName() {
        val expected = "Reds"

        assertEquals(expected, testSeasonsAverage.getHomeTeamName("""
            {
                "__typename" : "ChampionshipGame",
                "bracketId" : 201,
                "gameState" : "P",
                "startDate" : "",
                "homeTeamName" : "Reds",
                "awayTeamName" : "Cubs",
				"homeTeamScore" : 35,
				"awayTeamScore" : 0
            }
        """))
    }

    @Test
    fun testGetAwayTeamName() {
        val expected = "Cubs"

        assertEquals(expected, testSeasonsAverage.getAwayTeamName("""
            {
                "__typename" : "ChampionshipGame",
                "bracketId" : 201,
                "gameState" : "P",
                "startDate" : "",
                "homeTeamName" : "Reds",
                "awayTeamName" : "Cubs",
				"homeTeamScore" : 35,
				"awayTeamScore" : 0
            }
        """))
    }
}
