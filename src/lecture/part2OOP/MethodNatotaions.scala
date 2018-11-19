package lecture.part2OOP

object MethodNatotaions extends App {

  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def isMovie: Boolean = true
    def apply(): String = s"Hi, my name is $name"
  }

  val mary = new Person("Mary", "War")
  println(mary.likes("love"))
  // mary.likes("love") == mary likes "love"   |||---> only work with method with only one parameter
  // infix notation = operator notation
  println(mary likes "love")

  // 1: infix notation act as "opeartor"

  // 2: prefix notation onely use : unary_ with - + ~ ! !!!
  val x = -1
  val y = 1.unary_-   // equal to -1

  // 3: postfix notation : method without any parameters
  println(mary.isMovie)
  println(mary isMovie)

  // 4: apply  : apply() method can be used as this()  ---> apply(x) = this(x)
  println(mary.apply())
  println(mary())

}
