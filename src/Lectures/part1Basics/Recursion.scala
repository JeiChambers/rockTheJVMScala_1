package Lectures.part1Basics

import scala.annotation.tailrec

object Recursion extends App {
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)

      result
    }

  println(factorial(10))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // TAIL RECURSION = use recursive call as the LAST expression

    factHelper(n, 1)
  }

  println(anotherFactorial(5000))
  // When you need loops, use tail recursion!


  @tailrec
  def concatTailrec(aString: String, n: Int, accumulator: String): String = {
    if (n <= 0) accumulator
    else concatTailrec(aString, n - 1, aString + accumulator)
  }

  println(concatTailrec("All is fair in Love and War! ", 5, " "))



  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
    if (!isStillPrime) false
    else if (t <= 1) true
    else isPrimeTailrec(t -1, n % t !=0 && isStillPrime)

    isPrimeTailrec(n / 2, true)

  }

  println(isPrime(2003))
  println(isPrime(37 * 17))


  def fibonacci(n: Int): Int ={
    @tailrec
    def fibonacciTailrec(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= n) last
      else fibonacciTailrec(i + 1, last + nextToLast, last)

    if (n <=2 ) 1
    else fibonacciTailrec(2, 1, 1)
  }






}