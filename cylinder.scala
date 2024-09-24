import scala.io.StdIn
import scala.math.Pi

object Cylinder {
    def main(args: Array[String]): Unit = {
        // Prompt the user to enter the radius of the cylinder
        println("Enter the radius of the cylinder: ")
        val radius = StdIn.readDouble()  // Read radius input from the user

        // Prompt the user to enter the height of the cylinder
        println("Enter the height of the cylinder: ")
        val height = StdIn.readDouble()  // Read height input from the user

        // Calculate the volume of the cylinder using the formula: V = πr²h
        val volume = Pi * (radius * radius) * height

        // Calculate the surface area of the cylinder using the formula: A = 2πr(h + r)
        val surfaceArea = (2 * Pi * radius * height) + (2 * Pi * radius * radius)

        // Print the calculated volume and surface area
        println(s"The volume of the cylinder is: $volume")
        println(s"The surface area of the cylinder is: $surfaceArea")
    }
}
