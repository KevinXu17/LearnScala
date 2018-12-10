package lecture.part2OOP

object CaseClass {
  def main(args: Array[String]): Unit = {

     case class Person(name: String, age: Int)

    // WHEN USE CASE : which u donot need to use "new" for instance ; <---- apply default
    // 1. class parameters are fields  ; <---------
    val Jim =  new Person("Jim", 14)

    println(Jim.name)

    // 2. sensible toString: println(instance) == println(instance.toString)
    println(Jim.toString) //
    println(Jim)          // both are same:  Person(Jim,14)

    class Book(name: String, year: Int)
    val novel = new Book("Anne with an E", 1) //<--- must has new

    //println(novel.name) >>---- error
    println(novel)  //;; CaseClass$Book$1@1cd072a9
    println(novel.toString) // Same as above

    // 3. equals and hashCode implemented OOTB
    val Jim2 = new Person("Jim2", 29)
    println(Jim2 == Jim) // output true!    :: if without case, it will output false (difference instance)

    // 4. handy copy method
    val Jim3 = Jim.copy(age = 45)
    println(Jim3.age) //45
    println(Jim.age) // 14    but has same name

    // 5. companion object
    val thePerson = Person

    // 6.serializable
    // Akka
    // send instances of case classes through the network and in between JVM

    //7. extractor patterns: can be used in Pattern Matching

    case object UK {
      def name: String = "The UK"
    }


  }
}
