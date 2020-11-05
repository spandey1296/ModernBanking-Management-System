
import java.io.File

fun main() {

    val fileName = "src/resources/myfile3.txt"

    val myfile = File(fileName)

    val content = "Today snow is falling."

    myfile.writeText(content)

    println("Writed to file")




}