import resources.Wealthmanage
import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>)
{
      Dateandtime.dateandtime()
      var bankAccounts = readAccounts()
      AccountSection.printBanner()

    while(true) {
        val input = BufferedReader(InputStreamReader(System.`in`))

        print("Enter Your Choice==> ")
        val choice = input.read()

        if(choice == 69) {
            val bankAccount = newAccount(input)
            bankAccounts.add(bankAccount)
        } else if(choice == 67) {
            // Check the account
            input.readLine()
            print("Enter account_no: ")
            val number = input.readLine().toInt()
            val bankAccount = bankAccounts.find { it.number == number }
            if(bankAccount != null) {
                printAccountHead()
                printAccount(bankAccount)
            }

        } else if(choice == 83) {
            bankAccounts.sortBy { it.number }
            printAccounts(bankAccounts)
        }
        else if (choice==75){
            Interest_Calculator.SimpleInterest()

        }
        else if (choice == 65){
            Contact_Us.Contactus()
        }
        else if (choice==73){

            Internate_banking.InternateBanking()
        }
        else if (choice == 76){
            AccoutSection.calCompound()

            var accopen = AccoutSection()
            accopen.openaccount()

        }
        else if(choice ==119){

            Wealthmanage.WeathManagement()




        }




        else if(choice == 84) {
            break
        }
    }

}


