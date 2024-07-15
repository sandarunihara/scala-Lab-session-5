def fibonacci(n: Int): Int = {
    if (n <= 1) n
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  def printFibonacciNumbers(n: Int): Unit = {
    if (n <= 0) {
      println("Invalid input. n should be greater than 0.")
    } else {
      println(s"First $n Fibonacci numbers:")
      for (i <- 0 until n) {
        print(fibonacci(i) + " ")
      }
      println()
    }
  }

  def main(args: Array[String]): Unit = {
    val n = 10 
    printFibonacciNumbers(n)
  }