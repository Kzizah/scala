object MultipleChecker {
  def isMultiple(n: Int): Boolean = {
    n % 3 == 0 || n % 7 == 0 || n % 11 == 0
  }

  def main(args: Array[String]): Unit = {
    val num = scala.io.StdIn.readInt()
    println(isMultiple(num))
  }
}
