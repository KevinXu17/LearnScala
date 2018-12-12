package lecture.part3FUN

object WhatisFun {

  def main(args: Array[String]): Unit = {

    // use function as first class elements
    // problem: oop

    val doubler = new Function[Int, Int] {
      override def apply(element: Int): Int = element * 2
    }
    println(doubler(3))

    // function types = function1[A, B]
    val stringToIntConverter = new Function[String, Int] {
      override def apply(elemnt: String): Int = {
        elemnt.toInt
      }
    }

    println(doubler(stringToIntConverter("4")))

    val adder: ((Int, Int) => Int) = new Function2[Int, Int, Int] {
      override def apply(a: Int, b: Int): Int = a + b
    }


    // Function types Function2[A, B, R] === (A, B) => R
    // All scala function are objects


    def concatenator: (String, String) => String = new Function2[String, String, String] {
      override def apply(a: String, b: String): String = a + b
    }

    // Function1[Int, Function1[Int, Int]]
    val superAdder: Function1[Int, Function1[Int, Int]] = new Function1[Int, Function1[Int, Int]] {
      override def apply(x: Int): Function1[Int, Int] = new Function1[Int, Int] {
        override def apply(y: Int): Int = x + y
      }
    }
    val adder3 = superAdder(3)
    println(adder3(4))
  }
}

 // oop
trait Function[A, B] {
  def apply(elemnt: A): B
}

// higer order functions: function can as parasmeter and output result ---> first class value
