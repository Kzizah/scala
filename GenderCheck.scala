object GenderCheck {
  def checkGender(gender1: String, gender2: String): Boolean = {
    (gender1 == "male" && gender2 == "female") || (gender1 == "female" && gender2 == "male")
  }

  def main(args: Array[String]): Unit = {
    val gender1 = scala.io.StdIn.readLine("Enter gender 1: ")
    val gender2 = scala.io.StdIn.readLine("Enter gender 2: ")
    println(checkGender(gender1, gender2))
  }
}
