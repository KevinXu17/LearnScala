package lecture.part2OOP

object OOBasics extends App {

  val person = new Person("John", 12)
  println(person.age)

  person.greet()
  person.greet("Kim")

  val p1 = new Person("a")
  println(p1.age)
}

// constructor
class Person(name: String, val age: Int) {
  // body
  var x = 2 //field

  println(1 + 4)

  // be careful for name and this.name (eventhough name isnot field but it can be used)
  def greet(name: String): Unit = println(s"$name says : Hi, ${this.name}")

  def greet(): Unit = println(s"Hi, I am $name") // still can point to parameter name

  // multiple constructors
  def this(name:String) = this(name, 1)
}

// class parameters are NOT fields
// add val in parameter to make it be field