import scala.util.Random

object StudentScoreCard {

  // Function to generate random marks
  def generateMarks(max: Int): Int = Random.nextInt(max + 1)

  // Partially applied function for calculating total marks in a unit
  def calculateTotal(cat1: Int, cat2: Int, exam: Int)(weight1: Int, weight2: Int, examWeight: Int): Int = {
    cat1 * weight1 / 10 + cat2 * weight2 / 20 + exam * examWeight / 70
  }

  // Function to assign grades based on total marks
  def assignGrade(total: Int): String = total match {
    case t if t >= 70 => "A"
    case t if t >= 60 => "B"
    case t if t >= 50 => "C"
    case t if t >= 40 => "D"
    case _            => "E"
  }

  def main(args: Array[String]): Unit = {
    // Prompt for student details
    println("Enter student number: ")
    val studentNumber = scala.io.StdIn.readLine()
    println("Enter student name: ")
    val studentName = scala.io.StdIn.readLine()

    // Print student details
    println(s"\nStudent Number: $studentNumber")
    println(s"Student Name: $studentName")
    println("\nUnit Scores:")

    // For each of the 8 units, generate marks and print the scorecard
    for (unit <- 1 to 8) {
      // Randomly generate marks for CAT 1 (out of 10), CAT 2 (out of 20), and Exam (out of 70)
      val cat1Marks = generateMarks(10)
      val cat2Marks = generateMarks(20)
      val examMarks = generateMarks(70)

      // Partially apply the function for weights
      val totalMarks = calculateTotal(cat1Marks, cat2Marks, examMarks)(10, 20, 70)

      // Get the grade based on total marks
      val grade = assignGrade(totalMarks)

      // Print out the results for this unit
      println(s"Unit $unit:")
      println(f"  CAT 1: $cat1Marks%d/10  | CAT 2: $cat2Marks%d/20  | Exam: $examMarks%d/70  => Total: $totalMarks%d  | Grade: $grade")
    }
  }
}
