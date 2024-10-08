import scala.util.Random

object TaxCalculatorForEach {
  val calculateTax = (income: Double) => {
    if (income <= 20000) 0
    else if (income <= 30000) income * 0.10
    else if (income <= 40000) income * 0.20
    else if (income <= 50000) income * 0.30
    else income * 0.40
  }

  def main(args: Array[String]): Unit = {
    val incomes = List.fill(10)(35000 + Random.nextDouble() * (350000 - 35000))
    
    incomes.foreach { income =>
      val tax = calculateTax(income)
      println(f"Income: $income%.2f, PAYEE: $tax%.2f")
    }
  }
}
