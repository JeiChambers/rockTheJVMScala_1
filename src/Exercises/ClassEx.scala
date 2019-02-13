package Exercises

object ClassEx extends App {

  val author = new Writer("Charles", "Dickens", 1812)
  // store class Writer into val author with three variables and parameters
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))

  val counter = new Counter

  counter.inc.print
  counter.inc.inc.inc.print


  //constructor
  class Writer(name: String, surname: String, val year: Int) {
    def fullname: String = name + " " + surname

    def yearofBirth: Int = year
  }

  class Novel(name: String, year: Int, author: Writer) {
    def authorAge: Int = year - author.year

    def isWrittenBy(author: Writer): Boolean = author == this.author

    def copy(newYear: Int): Novel = new Novel(name, newYear, author)
  }

  class Counter(val count: Int = 0) {
    def inc = {
      println("incrementing")
      new Counter(count + 1) // immutability
    }

    def dec: Counter = {
      println("decrementing")
      new Counter(count - 1)
    }

    def inc(n: Int):Counter = {
      if (n <= 0) this
      else inc.inc(n + 1)
    }

    def dec(n: Int): Counter = {
      if (n <= 0) this
      else dec.dec(n - 1)
    }

    def print = println(count)

    // class parameters are NOT FIELDS
  }

}