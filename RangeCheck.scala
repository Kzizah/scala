object RangeCheck {
  def isInRange(num1: Int, num2: Int): Boolean = {
    (1 to 100).contains(num1) || (1 to 100).contains(num2)
  }

  def main(args: Array[String]): Unit = {
    val num1 = scala.io.StdIn.readInt()
    val num2 = scala.io.StdIn.readInt()
    println(isInRange(num1, num2))
  }
}
