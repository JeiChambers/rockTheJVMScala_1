package Lectures.part2oop


object Inheritance extends App {

  // Scala features single class inheritance
  class Animal {
    val creatureType: String = "wild animal"
    def eat:Unit = println("nom nom nom")
  }

  class Cat extends Animal {
    def crunch: Unit = {
      eat
      println("crunch crunch")
    }
  }

//  val cat = new Cat
//  cat.crunch


  //constructors
  class Person(name: String, age:Int ) {
    def this(name: String) = this(name, 0)
  }

  class Adult(name: String, age:Int, idCard: String) extends Person (name, age)

  //overriding
  class Dog(override val creatureType: String) extends Animal {
    override def eat: Unit = {
      super.eat
      println("smackety smack!")
    }

  }
  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)

  // type substitution (broad: polymorphism)
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat

//overRiding (Different implementation in derived classes) vs overLoading(Supplying multiple methods w/ different sig)

  // super (Refers to methods in class' super class)

  // preventing Overrides
  //1 - use keyword 'final' on member
  //2 - use keyword 'final' on class
  //3 - seal the class = EXTEND classes in THIS FILE, PREVENT extension in OTHER FILES

}

