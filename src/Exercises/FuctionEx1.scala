package Exercises

object FuctionEx1 extends App{

  def greeting(name: String, age: Int): Unit ={
    println("Hi, my name is " + name + " and I am " + age + " years old." )
  }

  def Factorial(num: Int): Int = {
    if (num <= 0) 1
    else num * Factorial(num - 1)
  }
  println(Factorial(5))

  def fibonacci(n: Int): Int = {
    if (n <=2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }
  println(fibonacci(5))

  def isPrime(n: Int): Boolean ={
    def isPrimeUntil(t: Int): Boolean =
      if(t <= 1) true
      else n % t !=0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(7))
  println(isPrime(8))
}
