fun main(args: Array<String>) {
    print("Enter the name of a heavenly body: ")
    val name = readLine() ?: ""
    when (name) {
        "Sun" -> println("Sun is a Star")
        "Moon" -> println("Moon is a Satellite")
        "Earth" -> println("Earth is a planet")
        else -> println("Unknown heavenly body")
    }
}