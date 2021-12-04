package day3

fun powerConsumption(binaries: List<String>): Int {
    var gammaRate = ""
    var epsilonRate = ""
    for (i in 0 until binaries.first().length) {
        val zeroIsMostCommonBit = isZeroMostCommonBit(binaries, i)

        gammaRate += if (zeroIsMostCommonBit) "0" else "1"
        epsilonRate += if (zeroIsMostCommonBit) "1" else "0"
    }
    return Integer.parseInt(gammaRate, 2) * Integer.parseInt(epsilonRate, 2)
}

fun lifeSupportRating(binaries: List<String>): Int {
    return oxygenGeneratorRating(binaries) * co2ScrubberRating(binaries)
}

private fun co2ScrubberRating(binaries: List<String>): Int {
    var filteredBinaries = binaries
    for (i in 0 until filteredBinaries.first().length) {
        val zeroIsMostCommonBit = isZeroMostCommonBit(filteredBinaries, i)

        filteredBinaries = filteredBinaries.filter { binary -> binary[i] == if (zeroIsMostCommonBit) '1' else '0' }
        if (filteredBinaries.size == 1) {
            break
        }
    }
    return Integer.parseInt(filteredBinaries[0], 2)
}

private fun oxygenGeneratorRating(binaries: List<String>): Int {
    var filteredBinaries = binaries
    for (i in 0 until filteredBinaries.first().length) {
        val zeroIsMostCommonBit = isZeroMostCommonBit(filteredBinaries, i)

        filteredBinaries = filteredBinaries.filter { binary -> binary[i] == if (zeroIsMostCommonBit) '0' else '1' }
        if (filteredBinaries.size == 1) {
            break
        }
    }
    return Integer.parseInt(filteredBinaries[0], 2)
}

private fun isZeroMostCommonBit(binaries: List<String>, index: Int): Boolean {
    val bit = ArrayList<Int>()
    for (binary in binaries) {
        bit.add(binary[index].digitToInt())
    }
    return bit.sum() < binaries.size / 2f
}