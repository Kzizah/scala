import scala.io.StdIn  // Importing the standard input library to read input from the user

object Rectangle {
  def main(args: Array[String]): Unit = { 
    // Main function where the program starts execution

    // Prompt the user to enter the length of the rectangle
    println("Enter the length of the rectangle: ")  
    val length = StdIn.readDouble()  
    // `StdIn.readDouble()` is used to read a floating-point number (double) from the user input

    // Prompt the user to enter the width of the rectangle
    println("Enter the width of the rectangle: ")  
    val width = StdIn.readDouble()  
    // Similarly, reading the width of the rectangle as a double

    // Calculate the area of the rectangle
    val area = length * width  
    // The formula for area is length * width

    // Calculate the perimeter of the rectangle
    val perimeter = 2 * (length + width)  
    // The formula for perimeter is 2 * (length + width)

    // Print the calculated area of the rectangle
    println(s"The area of the rectangle is: $area")  
    // Using string interpolation (the `s` before the string) to print the value of `area`

    // Print the calculated perimeter of the rectangle
    println(s"The perimeter of the rectangle is: $perimeter")  
    // Similarly, printing the value of `perimeter`
  }
}
