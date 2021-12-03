import java.util.*

fun readIntInput(filePath: String): List<Int> {
    val classloader = Thread.currentThread().contextClassLoader
    val inputStream = classloader.getResourceAsStream(filePath) ?: return Collections.emptyList()

    val scanner = Scanner(inputStream)
    val list = ArrayList<Int>()

    while (scanner.hasNextInt()) {
        list.add(scanner.nextInt())
    }
    return list
}

fun readStringInput(filePath: String): List<String> {
    val classloader = Thread.currentThread().contextClassLoader
    val inputStream = classloader.getResourceAsStream(filePath) ?: return Collections.emptyList()

    val scanner = Scanner(inputStream)
    val list = ArrayList<String>()

    while (scanner.hasNextLine()) {
        list.add(scanner.nextLine())
    }
    return list
}