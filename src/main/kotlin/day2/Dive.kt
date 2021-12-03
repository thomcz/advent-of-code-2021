package day2

data class Movement(val direction: String, val distance: Int)

fun Movement(movement: String): Movement {
    val movementSplit = movement.split(" ")
    return Movement(movementSplit[0], movementSplit[1].toInt())
}

class Position(
    private var horizontalPosition: Int = 0,
    private var depth: Int = 0
) {
    fun move(movement: Movement) {
        when (movement.direction) {
            "forward" -> horizontalPosition += movement.distance
            "down" -> depth += movement.distance
            "up" -> depth -= movement.distance
        }
    }

    fun calculatePosition(): Int {
        return horizontalPosition * depth
    }
}

fun dive(movements: List<Movement>): Int {
    val position = Position()
    for (movement in movements) {
        position.move(movement)
    }
    return position.calculatePosition()
}