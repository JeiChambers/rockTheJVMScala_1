package Lectures.part2oop

object AnonymousClasses {

  abstract class Animal

  def eat: Unit

  // anonymous class
  val funnyAnimal: Animal = new Animal{
  override def eat: Unit = println("ahahahahaha")
  }
  /*
  equivalent with

  class AnonymousClass$$anon$1 extends Animal{
  override def eat: Unit = println()
   */
  println(funnyAnimal.getClass)

  class Person(name: String){
    def sayHi: Unit = println(s"Hi, my name is $name, how can I help?")
  }

  val jim = new Person("Jim"){
    override def sayHi: Unit = println(s"Hey there, the name is Jim, how can I be of service?")
  }



}
