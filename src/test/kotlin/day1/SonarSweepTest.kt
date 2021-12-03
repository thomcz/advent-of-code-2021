package day1

import org.junit.jupiter.api.Test
import readIntInput
import kotlin.test.assertEquals

class SonarSweepTest {
    @Test
    fun sonarSweep_easy() {
        val depths = listOf(
            199,
            200,
            208,
            210,
            200,
            207,
            240,
            269,
            260,
            263
        )

        val result = sonarSweep(depths)

        assertEquals(7, result)
    }

    @Test
    fun sonarSweep() {
        val depths = readIntInput("day1/sonarSweep.txt")

        val result = sonarSweep(depths)

        assertEquals(1374, result)
    }

    @Test
    fun sonarSweepWithoutNoise_easy() {
        val depths = listOf(
            199,
            200,
            208,
            210,
            200,
            207,
            240,
            269,
            260,
            263
        )

        val result = sonarSweepWithoutNoise(depths)

        assertEquals(5, result)
    }

    @Test
    fun sonarSweepWithoutNoise() {
        val depths = readIntInput("day1/sonarSweep.txt")

        val result = sonarSweepWithoutNoise(depths)

        assertEquals(1418, result)
    }
}