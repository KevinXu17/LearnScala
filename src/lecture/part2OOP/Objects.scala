package lecture.part2OOP

object Objects  {
  // not has static in Scala
  // Scala does not has class-level functionality
  object Person { // type + its only instance its type
                 // object only has one instance in Scala !!!<--------
    val N_EYES = 2
    def canFly: Boolean = false
  }

  class Person {
    val h: Int = 3
  }
  // Companions Person class and object in same file

  // Scala object = SINGLETON INSTANCE
  val mary = Person
  val john = Person

  println(mary == john) // true
  val kim = new Person
  println(mary == kim)  // false

  // Scala Applications = object with def main(args: Array[String]) : Unit

   // main in scala
  def main(args: Array[String]): Unit = {


  }

}
