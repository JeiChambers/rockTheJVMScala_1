package Lectures.part2oop

object OOBasics extends App{

  val person = new Person("Johnny", 26)
  println(person.age)
  person.greet("Daniel")
  person.greet()
}

//constructor
class Person(name: String, val age: Int = 0){
  //body
  val x =2

  println(1 + 3)

  //method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name.")

  // overloading
  def greet(): Unit = println(s"Hi $name, my name is also $name.")

  //multiple constructors | Done better by using default parameters in primary constructor.
  def this(name: String ) = this(name, 0 ) //Does the same thing as Int = 0 in p.c.
  def this() = this("John Does")

}


/*
Novel and a Writer

Writer: first name, surname, year of birth
  -method fullname

  Novel: name, year of release, author(instance fo type Writer)
    -authorAge (age of author at year of release)
    -isWrittenBy(author)
    -copy (new year of release ) = new instance of Novel  w/ new year of release
 */

/*
Counter class
    -receives an int value
    -method to increment/decrement
    -overload inc/dec to receive and amount
 */