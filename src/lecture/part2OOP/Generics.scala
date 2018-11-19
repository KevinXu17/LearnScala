package lecture.part2OOP

object Generics {
  def main(args: Array[String]): Unit = {

    class MyList[A] {
      // use the type A
    }

    class MyMap[Key, Value]

    trait MyTraitList[A] // trait also can use generics


    val listOfIntegers = new MyList[Int]
    val listofStrings = new MyList[String]

    object MyList {
      // generics methods
      def empty[A]: MyList[A] = throw new NoSuchElementException
    }

    val emptyListOfIntegers = MyList.empty[Int]

    // variance problem
    class Animal
    class Cat extends Animal
    class Dog extends Animal

    // COVARIANCE: List[Cat] extends List[Animal]
    class CovariantList[+A]
    val animal: Animal = new Cat
    val animalList: CovariantList[Animal] = new CovariantList[Cat]


    // INVARIANCE: List[Cat] not extends List[Animal]
    class InvariantList[A]
    val indvariantAnimalList: InvariantList[Animal] = new InvariantList[Animal] // can not be cat

    // CONTRAVARIANCE
    class ContravariantList[-A]
    val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal] // converse!!!! <----

    // bounded types
    // uppder bound           // >: lower bound     ====> only can be supertype by xx
    class Cage[A <: Animal](animal: A)  // A only can be subtype of Animal
    val cage = new Cage(new Cat)

    class Car
   // val newCage = new Cage(new Car)





  }
}
