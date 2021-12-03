package day2

import org.junit.jupiter.api.Test
import readStringInput
import kotlin.test.assertEquals

class DiveTest {
    @Test
    fun dive_easy() {
        val movements = listOf(
            Movement("forward 5"),
            Movement("down 5"),
            Movement("forward 8"),
            Movement("up 3"),
            Movement("down 8"),
            Movement("forward 2")
        )

        val position = dive(movements)

        assertEquals(150, position)
    }

    @Test
    fun dive() {
        val movements = readStringInput("day2/input.txt").map(::Movement)

        val position = dive(movements)

        assertEquals(1693300, position)
    }
}