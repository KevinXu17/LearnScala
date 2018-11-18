package lecture.part1base

object CBNvsCBV extends App{
//  def calledByValue(x: Long): Unit = {
//    println("by value: " + x)
//    println("by value: " + x)
//  }
//
//  def calledByName(x: => Long): Unit = { // evaluate x then put in back the function calledByname
//    println("by value: " + x)
//    println("by value: " + x)
//  }
//
//  calledByName(System.nanoTime())
//  calledByValue(System.nanoTime())
  var x = 1
  def add(a: Int): Int = {
    x += 1
    x
  }
  def printByValue(j: Int): Unit = {
    println(j)
    println(j)
  }

  def printByName(j: => Int): Unit = {
    println(j)
    println(j)
  }

  printByName(add(x))
  printByValue(add(x))

  // j: => Int call by name !! but it is lazy evaluation !!!!!
}
