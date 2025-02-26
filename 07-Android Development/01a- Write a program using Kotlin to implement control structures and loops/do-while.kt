fun main(args: Array<String>) {
    var number = 14
    var factorial = 1
    do {
        factorial *= number
        number--
    }while(number > 0)
    println("Factorial of 14 is $factorial")
}