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

  // return type Unit = void
  // function ====>   def functionName(paras...) = xxx      // has =

  def faa(n: Int): Int = {
    def fbb(a: Int, b: Int): Int = a + b
    fbb(n, n-1)
  }

  // A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
  def greet(name: String, age: Int): Unit = {
    println("Hi, my name is " + name + " and I am " + age + " years old.")
  }
  greet("A", 11)

  // Factorial Function
  def factorial(n: Int): Int = {
    if (n == 1 || n < 1) 1
    else
      n * factorial(n-1)
  }
  println("Factorial: " + factorial(10))

  // Fibonacci
  def fibonacci(n: Int): Int = {
    if (n == 1 || n == 2 || n < 1) 1
    else
      fibonacci(n-1) + fibonacci(n-2)
  }

  println("FIbonacci: " + fibonacci(10))
}
