package day3

import org.junit.jupiter.api.Test
import readStringInput
import kotlin.test.assertEquals

class BinaryDiagnosticTest {
    @Test
    fun binaryDiagnostic_powerConsumption_easy() {
        val binaries = listOf(
            "00100",
            "11110",
            "10110",
            "10111",
            "10101",
            "01111",
            "00111",
            "11100",
            "10000",
            "11001",
            "00010",
            "01010"
        )

        val result = powerConsumption(binaries)

        assertEquals(198, result)
    }

    @Test
    fun binaryDiagnostic_powerConsumption() {
        val binaries = readStringInput("day3/input.txt")

        val result = powerConsumption(binaries)

        assertEquals(3985686, result)
    }

    @Test
    fun binaryDiagnostic_lifeSupportRating_easy() {
        val binaries = listOf(
            "00100",
            "11110",
            "10110",
            "10111",
            "10101",
            "01111",
            "00111",
            "11100",
            "10000",
            "11001",
            "00010",
            "01010"
        )

        val result = lifeSupportRating(binaries)

        assertEquals(230, result)
    }

    @Test
    fun binaryDiagnostic_lifeSupportRating() {
        val binaries = readStringInput("day3/input.txt")

        val result = lifeSupportRating(binaries)

        assertEquals(2555739, result)
    }
}