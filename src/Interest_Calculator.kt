import java.util.*

class Interest_Calculator {

    companion object {


        fun SimpleInterest() {

            val scanner = Scanner(System.`in`)

            print("Enter principal amount : ")
            var p: Int = scanner.nextInt()

            print("Enter rate of interest : ")
            var r: Int = scanner.nextInt()

            print("Enter number of years : ")
            var n: Int = scanner.nextInt()

            var SI: Int = (p * n * r) / 100
            var total= SI + p


            println("Simple interest for Your Amount ${p} and Rate ${r} and Year ${n} as your Required is: " + SI)
            println("After Adding Your Interest Your Anout will be: " + total)


        }

    }




}
