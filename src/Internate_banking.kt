import java.io.BufferedReader
import java.io.InputStreamReader
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.*
import kotlin.system.exitProcess

class Internate_banking {


    companion object {

        fun InternateBanking() {
            Dateandtime.dateandtime()

            val current = LocalDateTime.now()
            val formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
            val formatted = current.format(formatter)
            println("WELCOME TO INTERNATE BANKING FACILITY                                                     Current Date is: ${formatted}")
            println("Please select an option from the following menu:")
            println("Press\t • 1--> Know Bank IFCS code")
            println("Press\t • 2--> Register for Internate Banking")
            println("Press\t • 3-->User Verification")
            println("Press\t • 0-->Exit")
            val choice = Integer.valueOf(readLine())
            print("Enter Your Choice==> ")

            if (choice == 1) {
                val branch = listOf("Auranagabd,Bihar", "Patna,Bihar", "Delhi", "Mumbai", "Kolkata", "Pune", "Kerala")
                val ifcs = listOf("82101", "43534543", "34534543", "655445", "32543543", "789789", "82454")
                println(branch.zip(ifcs) { branch, ifcs -> "The IFCS code --> ${ifcs.capitalize()} : $branch;" })
            }
            else {
                println("Ohh! Incorrect Entry")
            }

            if (choice == 2)
            {
                var chechmail= readLine()
                if (chechmail!=null)
                {
                    println("You can apply for Internate Banking, Visit Nearest Branch to Register")

                }
                else{
                    println("Invalid Email")

                }
            }
            else{

                println("Visit to Nearest Branch for More Details")


            }
            if (choice== 3)
            {
                println("Service unavailable")

            }
            if (choice==0)
            {
                main()

            }
            
        }

        private fun main() {
            println("Thankyou For Visiting ModernBanking")
            var bankAccounts = readAccounts()
            AccountSection.printBanner()
        }
    }
}






