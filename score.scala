object StudentScoreCard {

  // Function to calculate total marks in a unit
  def calculateTotal(cat1: Int, cat2: Int, exam: Int): Int = {
    (cat1 * 10 / 10) + (cat2 * 20 / 20) + (exam * 70 / 70)
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
    if (args.length < 26) {
      println("Please provide all the required inputs: StudentNumber, StudentName, and marks for 8 units (CAT 1, CAT 2, Exam for each)")
      return
    }

    // Read the student number and name from the command-line arguments
    val studentNumber = args(0)
    val studentName = args(1)

    // Print student details
    println(s"\nStudent Number: $studentNumber")
    println(s"Student Name: $studentName")
    println("\nUnit Scores:")

    var argIndex = 2

    // Loop over the 8 units (3 inputs per unit: CAT 1, CAT 2, Exam)
    for (unit <- 1 to 8) {
      // Parse CAT 1, CAT 2, and Exam marks from the command-line arguments
      val cat1Marks = args(argIndex).toInt
      val cat2Marks = args(argIndex + 1).toInt
      val examMarks = args(argIndex + 2).toInt

      // Calculate the total marks
      val totalMarks = calculateTotal(cat1Marks, cat2Marks, examMarks)

      // Get the grade based on total marks
      val grade = assignGrade(totalMarks)

      // Print out the results for this unit
      println(s"Unit $unit:")
      println(f"  CAT 1: $cat1Marks%d/10  | CAT 2: $cat2Marks%d/20  | Exam: $examMarks%d/70  => Total: $totalMarks%d  | Grade: $grade")

      // Increment argIndex to read the next set of marks for the next unit
      argIndex += 3
    }
  }
}
