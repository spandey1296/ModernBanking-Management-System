import java.io.File

interface BankInterface {

   fun openaccount(){
      Dateandtime.dateandtime()
      println(" Welcome to Maodern Bank corporation opening Portal")
      println("**Necessary Document for opening an Account*********")
      val fileName = "src/resources/accountopening.txt"
      val content = File(fileName).readText()
      println(content)

  }



}