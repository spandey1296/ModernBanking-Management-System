import java.io.File

import java.io.BufferedReader
import java.util.ArrayList

data class BankAccount(
        val number: Int,
        val name: String,
        val type: String,
        val interestRate: Double,
        val balance: Int
)
fun printAccount(bankAccount: BankAccount) {
    println(" ${bankAccount.number} ${bankAccount.name} ${bankAccount.type} ${bankAccount.interestRate} ${bankAccount.balance} ")
}

fun printAccountHead() {
    println("Number\tName\t\t\tType\t\tInterest Rate\t\tBalance")
}

fun printAccounts(bankAccounts: List<BankAccount>) {
    printAccountHead()
    bankAccounts.forEach {
        printAccount(it)
    }
}

fun readAccounts(): ArrayList<BankAccount> {
    val bankAccounts = arrayListOf<BankAccount>()
    val file = File("src/BankAccount.txt")
    val text = file.readText()
    text.split("\n").forEach {
        val line = it.split(", ")
        if(line.size > 1) {
            val number = line[0].removeSurrounding("\"").toInt()
            val name = line[1].removeSurrounding("\"") + ", " + line[2].removeSurrounding("\"")
            val type = line[3].removeSurrounding("\"")
            val interestRate = line[4].toDouble()
            val balance = line[5].substring(0, line[5].length - 1).toInt()
            val bankAccount = BankAccount(number, name, type, interestRate, balance)

            bankAccounts.add(bankAccount)
        }
    }

    return bankAccounts
}
fun newAccount(input: BufferedReader): BankAccount {
    input.readLine()
    println("Enter New Account Data:")
    print("\t • Account No.:")
    val number = input.readLine().toInt()
    print("\t • Name:")
    val name = input.readLine()
    print("\t • Account Type:")
    val type = input.readLine()
    print("\t • Interest Rate:")
    val interestRate = input.readLine().toDouble()
    print("\t • Balance:")
    val balance = input.readLine().toInt()

    return BankAccount(number, name, type, interestRate, balance)
}
