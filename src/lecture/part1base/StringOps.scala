package lecture.part1base

object StringOps  extends App {
  val str: String = "Hello, A b C D"
  // charAt()
  println(str.charAt(4))
  // substring
  println(str.substring(1))
  // split
  println(str.split("A").apply(1)) // ->>>> split return Array
  // startsWith
  println(str.startsWith("He"))
  //replace
  println(str.replace("A", "a"))

  // S-interpolators : must has s then inside with signal $         SSSSSSSSSSSS
  // ${xxxx} can run the xxx inside
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"
  val otherGreeting = s"Hello, my name is ${name + " Lee"} and I am ${age + 12} years old"
  println(greeting)
  println(otherGreeting)

  // F-interpolators    use with %x
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  println(myth)

  // raw-interpolators  change \n to be string
}
