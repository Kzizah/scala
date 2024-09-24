import scala.io.StdIn

object triangle{
    def main(args: Array[String]): Unit={
        println("Enter the base of the triangle: ")
        val base=StdIn.readDouble()

        println("Enter the height of the triangle: ")
        val height=StdIn.readDouble()

        println("Enter side1 of the triangle: ")
        val side1=StdIn.readDouble()

        println("Enter side2 of the triangle: ")
        val side2=StdIn.readDouble()

        //calculate the area and perimeter
        val area=(base*height)/2
        val perimeter=side1+side2+base

        //output results
        println(s"The area is: $area")
        println(s"The perimeter is: $perimeter")
    }
}