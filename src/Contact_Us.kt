import java.io.File

class Contact_Us {

    companion object{

        fun Contactus(){
            Dateandtime.dateandtime()

        println("Contact Us")
            val fileName = "src/resources/contact.txt"
            val content = File(fileName).readText()
            println(content)

        }
    }
}