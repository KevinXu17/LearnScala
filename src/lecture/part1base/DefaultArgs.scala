package lecture.part1base

object DefaultArgs extends App {
  def trFact(n: Int, acc: Int = 1): Int = // <------default value 1 if dont put any value in it
    if (n <= 1) acc                       // default value just can be the last one parameter!!!
    else trFact(n-1, n * acc)

  trFact(10)
  // SOLVE THE DEFAULT PROBLEM
  def foo (a: Int = 1, b: String = "b", c: Boolean = true): Unit = {
    println("blah")
  }
  foo(b = "c") // <------ solve the default problem by setting clear which parameter u use
}
