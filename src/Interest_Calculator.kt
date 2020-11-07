import java.util.*

class Interest_Calculator {

    companion object {


        fun SimpleInterest() {

            val scanner = Scanner(System.`in`)
             val ch=scanner.nextInt();
            if (ch==1) {


                print("Enter principal amount : ")
                var p: Int = scanner.nextInt()

                print("Enter rate of interest : ")
                var r: Int = scanner.nextInt()

                print("Enter number of years : ")
                var n: Int = scanner.nextInt()

                var SI: Int = (p * n * r) / 100
                var total = SI + p


                println("Simple interest for Your Amount ${p} and Rate ${r} and Year ${n} as your Required is: " + SI)
                println("After Adding Your Interest Your Amout will be: $total")
            }
            else if (ch == 2){

                println("The current SI of the Bank is 10%  according to RBI rules of Interest")
                println(" As per RBI rules of the guidelines, Inerest is not more than 0% of the corresponding banks")


            }




        }

    }




}
