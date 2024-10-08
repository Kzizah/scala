object EmployeeTaxCalculator {
  val calculateTax = (income: Double) => {
    if (income <= 20000) 0
    else if (income <= 30000) income * 0.10
    else if (income <= 40000) income * 0.20
    else if (income <= 50000) income * 0.30
    else income * 0.40
  }

  def main(args: Array[String]): Unit = {
    var i = 0
    while (i < 10) {
      val income = scala.io.StdIn.readDouble()
      val tax = calculateTax(income)
      println(s"Employee $i: Income: $$income, PAYEE: $$tax")
      i += 1
    }
  }
}
