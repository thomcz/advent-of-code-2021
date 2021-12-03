package day1

fun sonarSweep(depths: List<Int>): Int {
    var depthIncreasedCounter = 0
    for (i in 0 until depths.size - 1) {
        if (depths[i] < depths[i + 1]) {
            depthIncreasedCounter++
        }
    }
    return depthIncreasedCounter
}

fun sonarSweepWithoutNoise(depths: List<Int>): Int {
    val depthsWithoutNoise = ArrayList<Int>()

    for (i in 0 until depths.size - 2) {
        depthsWithoutNoise.add(depths[i] + depths[i + 1] + depths[i + 2])
    }

    return sonarSweep(depthsWithoutNoise)
}