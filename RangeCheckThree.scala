object RangeCheckThree {
  def isInRange(a: Int, b: Int, c: Int): Boolean = {
    (20 to 70).contains(a) || (20 to 70).contains(b) || (20 to 70).contains(c)
  }

  def main(args: Array[String]): Unit = {
    val a = scala.io.StdIn.readInt()
    val b = scala.io.StdIn.readInt()
    val c = scala.io.StdIn.readInt()
    println(isInRange(a, b, c))
  }
}
