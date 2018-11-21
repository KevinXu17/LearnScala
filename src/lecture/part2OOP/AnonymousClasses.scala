package lecture.part2OOP

object AnonymousClasses {
  def main(args: Array[String]): Unit = {
    abstract class Animal {
      def eat: Unit
    }

    // anonymous class : <------ we use make val diretly from abstarct and jump over an object
    val funnyAnimal: Animal = new Animal {
      override def eat: Unit = println("Blah Blah")
    }

    // also for normal class
    class Fish {
    def swim: Unit = ""
    }
    // anonymous class
    val flyFish = new Fish {
      override def swim: Unit = "adsfsdf"
    }

    println(flyFish.getClass)

    // normal class
    val realFish = new Fish

    println(realFish.getClass)

    //trait
    trait Car {
      def move: String = "moving"
    }

    val truck = new Car {}
    println(truck.move)
  }

}
