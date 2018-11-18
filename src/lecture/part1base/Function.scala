package lecture.part1base

object Function  extends App {

  // def keywork for define function
  def foo (a: String, b: Int) : String = {  // with or without : String is still return String
    a + " " + b
  }
  println(foo("a", 100))

  def repeatString(aString: String, n: Int) : String = { // but the recursive function must has return type
    if (n == 1 || n < 1) aString
    else
      aString + repeatString(aString, n -1)
  }
  println(repeatString("One", 10))
  // Scala should use recursion!!! for Functional Language
}
