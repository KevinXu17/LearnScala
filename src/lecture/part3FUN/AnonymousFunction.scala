package lecture.part3FUN

object AnonymousFunction {

  def main(args: Array[String]): Unit = {

    // lambda form
    val double = (x: Int) => x * 2
    println(double(2))

    val double2: Int => Int = x => x * 2

    // multiple params
    val adder = (a: Int, b: Int) => a + b

    val adder1: (Int, Int) => Int = (x, y) => x + y
    println(adder1(1,2))

    // no params
    val foo = () => println("foo")
    foo   //  <---- function
    foo() //  <----- app


    // curly braces with lambda
    val stringToInt = {
      (str: String) => str.toInt
    }


    // syntactic sugar
    val nicIncrementer: Int => Int = _ + 1 // x => x+1
    val niceAdder: (Int, Int) => Int = _ + _ // (a, b) => a+b
  }
}
