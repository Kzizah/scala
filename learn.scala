object Demo {
   def main(args: Array[String]): Unit = {
      if (args.length > 0) {
         println("Command-line arguments:")
         args.foreach(println)
      } else {
         println("No command-line arguments were provided.")
      }
   }
}
