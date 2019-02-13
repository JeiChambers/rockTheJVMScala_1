package Lectures.part1Basics

object StringOps extends App{

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length())
  println(str.concat(" to get work in Dev Ops."))

  val aNumberString = "2"
  val aNumber = aNumberString.toInt

  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  //S-interpolators
  val name = "Johnny"
  val age = "30"
  val greeting = s"Hello, my name is $name and I am $age years old!"
  val greeting2 = s"Hello my name is $name and I'm turning ${age.toInt + 1}"

  println(greeting2)

  //F-interpolators
  val time = 4.4f
  val rumor = f"$name%s can run the 40-yard dash in $time%2.2f seconds."

  println(rumor)

  //raw-interpolator
  println(raw"This ain't gonna make a \n newline")

  val escaped = "This is a \n newline"
  println(raw"$escaped")

}
