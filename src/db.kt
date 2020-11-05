
import java.io.File
import AccountSection
import java.util.*

fun main() {

    val fileName = "src/resources/myfile3.txt"
    Scanner sc= new Scanner(System.in);

    val myfile = File(fileName)

    val content = "Today snow is falling."

    myfile.writeText(content)

    println("Writed to file")




}