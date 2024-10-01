import scala.io.StdIn

object sum_integer {
  def main(args: Array[String]): Unit = {
    // Prompt the user to enter the number of integers to sum
    println("How many integers do you want to sum?")
    val count = StdIn.readInt()

    // Create an empty list to store the integers
    var numbers = List[Int]()

    // Loop to get all the integers from the user
    for (i <- 1 to count) {
      println(s"Enter integer $i:")
      val num = StdIn.readInt()
      numbers = num :: numbers
    }

    // Calculate the sum of all integers in the list
    val sum = numbers.sum

    // Print the sum
    println(s"The sum of the entered integers is: $sum")
  }
}
