import java.io.File

class Contact_Us {

    companion object{

        fun Contactus(){

            val fileName = "src/resources/contact.txt"
            val content = File(fileName).readText()
            println(content)

        }









    }





}