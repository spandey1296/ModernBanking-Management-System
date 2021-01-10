import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

class Dateandtime {

    companion object {
        fun dateandtime() {

          val current = LocalDateTime.now()
          val formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
          val formatted = current.format(formatter)
          println("WELCOME TO MODERN BANK CORPORATION")                                                      Current Date is: ${formatted}")

      }
  }
}