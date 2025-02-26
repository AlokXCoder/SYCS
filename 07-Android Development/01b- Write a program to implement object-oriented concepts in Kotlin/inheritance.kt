open class Student(name: String, rollno: Int, stream: String)
{
    init {
        println("Name is $name.")
        println("Roll No is $rollno")
        println("Student of $stream")
    }
}
class Programmer (name: String, rollno: Int, stream:
String): Student(name, rollno, stream) {
    fun doProgram() {
        println("I'm Learning Kotlin Programming")
    }
}
fun main(args: Array<String>){
    val obj1 = Programmer("Jarvis", 14, "CS")
    obj1.doProgram() }