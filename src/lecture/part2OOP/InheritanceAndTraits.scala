package lecture.part2OOP

object InheritanceAndTraits extends App {
  class Animal {
    def eat = println("nomnom")
    private def smell = println("ssss...")  // private
  }

  trait foot {

  }
  trait hand {}

  class Cat extends Animal with foot with hand  {
    override def eat = println("Hahahaa")  // override
  }
  val cat = new Cat
  cat.eat

  // polymorphism : type substitution
  val unknownAnimal: Animal = new Cat
  unknownAnimal.eat  // use cat'eat method

  // super
  // super.eat use the method from super type :     same as java


  // preventing overrides:
  //1: final in method or class
  //2: seal: sealed , the class in same file can extends but other files can not extends
}
