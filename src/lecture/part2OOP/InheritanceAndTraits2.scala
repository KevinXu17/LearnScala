package lecture.part2OOP

object InheritanceAndTraits2 {
  def main(args: Array[String]): Unit = {

    // abstract
    abstract class Animal {       // abstract
      val creatureType: String   // did not add any value
      def eat: Unit              // did not has implement method

    }

    class Dog extends Animal {
      override val creatureType: String = "Canine"

      override def eat: Unit = println("Wang Wang Wang")
    }


    // traits
    trait Carnivore {
      def eat(animal: Animal): Unit
    }

    trait www
    class Crocodile extends Animal with Carnivore with www {
       val creatureType: String = "croc"
       def eat: Unit = "asdfasfd"
       def eat(animal: Animal): Unit = s"I am a $creatureType"
    }

    // traits vs abstract
    // both: can abstract type or method
    // traits : 1: can not has constructor parameters 2: can inherited multiple traits 3: behavior
    // abstract: things

  }
}
