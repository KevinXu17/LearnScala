package lecture.part1base

import scala.annotation.tailrec

object Recursion extends App {
//  def factorial(n: Int): BigInt = {
//    if (n <= 1) 1
//    else
//        println("Computing factorial of " + n)
//       // val result = n * factorial(n-1)         // <-----  //StackOverflowError!!
//        result
//    n * factorial(n-1)
//  }
//
//  println(factorial(5000))  // < ----- 0


  def newFactorial(n: Int): BigInt = {
    @tailrec         //<---- check is tail recursion
    def factorialHelper(a: Int, b: BigInt): BigInt =
      if (a <= 1) b
      else
        factorialHelper(a - 1, a * b)  // <------------------ tail recursion signal in the left side of def helper


    factorialHelper(n, 1)
  }

 // println(newFactorial(5000)

  // tail recursion isPrime
  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeHelper(a:Int, b:Boolean): Boolean = {
      if (a <= 1)  true
      else if (!b) true
      else {
        if (n % a == 0)  false
        else
          isPrimeHelper(a-1, true)
      }
    }
    isPrimeHelper(n/2, true)
  }

  println(isPrime(2003))


}
