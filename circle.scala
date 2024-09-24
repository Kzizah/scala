object Circle {
    def main(args: Array[String]): Unit = {
        // Importing the math library for mathematical constants and functions
        import scala.math.Pi

        // Prompt the user to enter the radius of the circle
        println("Enter the radius of the circle: ")

        // Read the radius from user input and convert it to a Double
        val radius = scala.io.StdIn.readDouble()

        // Calculate the area of the circle using the formula: Area = π * r^2
        val area = Pi * radius * radius

        // Calculate the perimeter (circumference) of the circle using the formula: Perimeter = 2 * π * r
        val perimeter = 2 * Pi * radius

        // Print the calculated area and perimeter
        println(s"Area of the circle: $area")
        println(s"Perimeter of the circle: $perimeter")
    }
}
