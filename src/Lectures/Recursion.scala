package Lectures

object Recursion extends App {
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + "- I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)

      result
    }

  println(factorial(10))


  def anotherFactorial(n: Int): BigInt = {
    def factHelper(x: Int, accumulator: BigInt): BigInt =
     if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) //TAIL Recursion = use recursive call as the last expression

    factHelper(n, 1)
  }

  println(anotherFactorial(5000))

}
