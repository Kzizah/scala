object LastDigitCheck {
  def hasSameLastDigit(a: Int, b: Int): Boolean = {
    a % 10 == b % 10
  }

  def main(args: Array[String]): Unit = {
    val a = scala.io.StdIn.readInt()
    val b = scala.io.StdIn.readInt()
    println(hasSameLastDigit(a, b))
  }
}
