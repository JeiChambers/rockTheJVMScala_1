package Lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)
    def unary_! : String = s"${name} what the heck?!"
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)
    def isAlive: String = "Alive and well!"
    def apply(): String = s"Hi, my name is ${name} and I like ${favoriteMovie}."
    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"
    def learns(thing: String) = s"$name is learning $thing"
    def learnsScala = this learns "Scala"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") //equivalent
  // infix notation = operator notation (syntactic sugar)

  // "operators" in Scala
  val tom = new Person("Tom", "Enter the Spiderverse")
  println(mary + tom)
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


  //exercises

  /*
1. Overload the + operator
   mary + "the rockstar" => new person "Mary (the rockstar)"

2. Add an age to the Person class
   Add a unary + operator => new person with the age + 1
   +mary => mary with the age incrementer

3. Add a "learns" method in the Person class => "Mary learns Scala"
   Add a learnScala method, calls learns method with "Scala".
   Use it in postfix notation.

4. Overload the apply method
   mary.apply(2) => "Mary watched Inception 2 times"
 */

  println((mary + "The Rockstar").apply())
  println(+mary.age)
  println(mary learnsScala)
  println(mary(10))
}