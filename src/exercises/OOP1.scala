package exercises

object OOP1 extends App {
  val Tom = new Writer("Tom", "Lee", 1999)
  println(Tom.fullName())
}

// Writer class
class Writer (var fn: String, var sn: String, var year: Int) {
  def fullName(): String = {
    fn + " " + sn
  }
}

// Novel class
class Novel (var name: String, var yol: Int, var author: Writer) {
  def authorAge(): Int = {
    author.year
  }
  def isWrittenBy(a: Writer): Boolean = {
    a == author
  }
  def copy(newYear: Int): Novel = {
    new Novel(name, newYear, author)
  }
}