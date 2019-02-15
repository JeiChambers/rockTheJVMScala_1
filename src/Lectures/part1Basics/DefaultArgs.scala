package Lectures.part1Basics

object DefaultArgs extends App {



  def trFact(n: Int, acc: Int): Int =
    if (n <=1 ) acc
    else trFact(n-1, n*acc)

  val fact10 = trFact(10, 1)

  def savePicture(format: String, width: Int = 1920, height: Int = 1080): Unit = println("saving picture")
  savePicture("jpg", 800, 600)
}

/*
1. pass in every argument
2. name the arguments
 */