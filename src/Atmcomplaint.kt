import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader

class Atmcomplaint {

    companion object
    {

        fun atm_complaint(){
            println("Welcome to The Facility of Customer Grievence Cell")

            Dateandtime.dateandtime()

            val fileName = "src/resources/myfile3.txt"

            val myfile = File(fileName)
            val content = BufferedReader(InputStreamReader(System.`in`))

            myfile.writeText(content.toString())

            println("Compaint Registered Successfully!!")





        }






    }


}