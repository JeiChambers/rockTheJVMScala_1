package Lectures.part2oop

object AbstractDataTypes extends App {

  // abstract (Classes which contain unimplemented or abstract fields or methods are called abstract classes\
  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Frog extends Animal{
    override val creatureType: String = "frog"
    def eat: Unit = println("snap snap")
  }

  //traits
  trait Carnivore{
    def eat(animal: Animal): Unit
    val preferredMeal = "fresh meat"
  }

  trait coldBlooded{
    def bloodType: Unit = println("cold")
  }

  class Crocodile extends Animal with Carnivore with coldBlooded {
    val creatureType: String = "croc"
    def eat: Unit = println("nom nom nom")
    def eat(animal : Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")
  }

  val frog = new Frog
  val croc = new Crocodile

  croc.eat(frog)

  /* traits vs. abstract
    1 - traits do not have constructor parameters
    2 - multiple traits may be inherited by the same class
    3 - traits = behavior, abstract class = type of thing

  */

}
