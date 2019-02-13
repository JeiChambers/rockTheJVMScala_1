package Lectures.part2oop

object MethodNotations extends App{

  class Person(val name: String, favoriteMovie: String){
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"${name} what the heck?!"
    def isAlive: String =  "Alive and well!"
    def apply(): String = s"Hi, my name is ${name} and I like ${favoriteMovie}."
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") //equivalent
  // infix notation = operator notation (syntactic sugar)

  // "operators" in Scala
  val tom = new Person("Tom", "Enter the Spiderverse")
  println(mary + tom )
  println(mary.+(tom))

  println(1 + 2)
  println(1.+(2))

  //  ALL OPERATORS ARE METHODS.
  // Akka actors have ! ?

  // prefix notation
  val x = -1 //equivalent with 1.unary_-
  val y = 1.unary_-
  // unary_prefix only works with -, +, ~, !

  println(mary.unary_!)
  println(!mary) //equivalent

  // postfix notation
  println(mary.isAlive)
  println(mary isAlive) //equivalent

  // apply
  println(tom.apply())
  println(tom()) //equivalent
}
