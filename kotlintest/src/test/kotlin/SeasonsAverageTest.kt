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
                "startDate" : ""
            }
        """))
    }
}
