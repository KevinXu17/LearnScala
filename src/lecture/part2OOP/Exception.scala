package lecture.part2OOP

import java.nio.BufferOverflowException

object Exception {
  def main(args: Array[String]): Unit = {

    val x: String = null
    //println(x.length)  --->  exception

    def foo(boo: Boolean): Int = {
      if (boo) throw new RuntimeException("No int for you")
      else 200
    }

    try {
      println(foo(false))
    } catch {
      case e: RuntimeException => println(e.getMessage) // define an exception which must match the exception it thrown
    } finally {
      println("Ok, no error")
    }


    // outofMemoryError
    // val array = Array.ofDim(Int.MaxValue)

    // SO stack overflow
    //def infinite: Int = 1 + infinite

    //val noLimit = infinite

    class OverflowException extends RuntimeException("too large")
    class UnderflowException extends RuntimeException("too small")
    class MathCalculationException extends RuntimeException("Division by 0")

    object PoketCalculator {
      def add(x: Int, y: Int): Int = {
        val result = x + y
        if (x > 0 && y > 0 && result < 0) throw new OverflowException
        else if (x < 0 && y < 0 && result > 0) throw new UnderflowException
        else result
      }

      def subtract(x: Int, y: Int): Int = {
        val result = x - y
        if (x > 0 && y < 0 && result < 0) throw new OverflowException
        else if (x < 0 && y > 0 && result > 0) throw new UnderflowException
        else result
      }

      def multiply(x: Int, y: Int): Int = {
        val result = x * y
        if (x > 0 && y > 0 && result < 0) throw new OverflowException
        else if (x < 0 && y < 0 && result < 0) throw new OverflowException
        else if (x < 0 && y > 0 && result > 0) throw new UnderflowException
        else if (x > 0 && y < 0 && result > 0) throw new OverflowException
        return result
      }

      def divide(x: Int, y: Int): Int = {
        if (y == 0) throw new MathCalculationException
        else x/y
      }
    }

    try {
      println(PoketCalculator.add(Int.MaxValue, 10))
    } catch {
      case e: OverflowException => println(e.getMessage)
    }





  }
}
