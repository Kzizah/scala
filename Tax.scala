object TaxCalculator {
  def main(args: Array[String]): Unit = {
    // Simplified anonymous function to calculate tax
    val calculateTax: Double => Double = income => {
      if (income <= 20000) {
        0.0
      } else if (income <= 30000) {
        (income - 20000) * 0.10
      } else if (income <= 40000) {
        1000 + (income - 30000) * 0.20  // 1000 = 10% of 10000
      } else if (income <= 50000) {
        3000 + (income - 40000) * 0.30  // 3000 = 10% of 10000 + 20% of 10000
      } else {
        6000 + (income - 50000) * 0.40  // 6000 = 10% of 10000 + 20% of 10000 + 30% of 10000
      }
    }

    // Test the function with an example income
    val income = 45000
    println(s"Tax payable for an income of $$income: $$${calculateTax(income)}")
  }
}
