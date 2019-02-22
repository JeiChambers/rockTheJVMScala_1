package Lectures.part2oop

import scala.collection.immutable.Stream.Empty

object Generics extends App {

  class JList[A]{
    //use the type A
  }

  class MyMap[Key, Value]

  val listofIntegers = new JList[Int]
  val listofStrings = new JList[String]

  // generic methods
  object JList {
    def empty[A]: JList[A] = ???
  }
  val emptyListofIntegers =JList.empty[Int]


  // variance problem
  class Animal
  class Cat extends Animal

  // 1. yes, List[Cat] extends List [Animal] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  // animalList.add(new Dog) ??? HARD QUESTION.

  // 2. NO = INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  // 3. Hell, no! CONTRAVARIANCE
  class ContravariantList[-A]
  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]
}


object GenericPrac extends App{


  class GenPrac[A]{
    private var genList: List[A] = Nil
    def push(x: A){genList = x :: genList}
    def peek: A = genList.head
    def pop(): A = {
      val currentTop = peek
      genList = genList.tail
      currentTop
    }
  }

  val genprac = new GenPrac[Int]
  genprac.push(1)
  genprac.push(2)
  println(genprac.pop)
  println(genprac.pop)

}