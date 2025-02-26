class num {
    // data member
    private var number: Int = 5
    // member function
    fun calculateSquare(): Int {
        return number*number
    }
}
fun main(args: Array<String>) {
// create obj object of Example class
    val obj = num()
    println("${obj.calculateSquare()}")
}