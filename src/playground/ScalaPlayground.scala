package playground

object ScalaPlayground { // automatically insert main in this object

  def main(args: Array[String]):Unit = {

    class Animal
    class Dog extends Animal
    class Cat extends Animal

    class Printer[+A] {

    }

    def print(a: Printer[Animal]): Unit = {
      println("Bi Bo")
    }

    val cp = new Printer[Cat]
    val num = 1
    val ap = new Printer[Animal]
    class BlackCat extends Cat
    print(new Printer[BlackCat])

  }
}
