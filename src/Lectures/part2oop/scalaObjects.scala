package Lectures.part2oop

object scalaObjects extends App {

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")
  object Person{
    val N_Eyes =2
    def canFly: Boolean = false

    //factory method
    def apply(mother: Person, father: Person): Person = new Person("Celeste")
  }

  class Person(name: String){
    // instance-level functionality

  }
  // THE OBJECT and CLASS 'PERSON' ARE COMPANIONS

  println(Person.N_Eyes)
  println(Person.canFly)


  val rachael = new Person("Rachael")
  val johnny = new Person("Johnny")
  println(rachael == johnny)


  val celeste = Person(rachael, johnny)

  // Scala Applications = Scala object with
  //def main(args: Array[String]): Unit

}
