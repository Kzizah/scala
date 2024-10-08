import scala.util.Random

object RandomTaxCalculator {
  val calculateTax = (income: Double) => {
    if (income <= 20000) 0
    else if (income <= 30000) income * 0.10
    else if (income <= 40000) income * 0.20
    else if (income <= 50000) income * 0.30
    else income * 0.40
  }

  def main(args: Array[String]): Unit = {
    val rand = new Random()
    var i = 0
    while (i < 10) {
      val income = 35000 + rand.nextDouble() * (350000 - 35000)
      val tax = calculateTax(income)
      println(f"Employee $i: Income: $income%.2f, PAYEE: $tax%.2f")
      i += 1
    }
  }
}
