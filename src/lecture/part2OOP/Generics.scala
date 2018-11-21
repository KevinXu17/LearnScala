package lecture.part2OOP

object Generics {
  def main(args: Array[String]): Unit = {

    class MyList[+A] {
      // use the type A
      def add[B >:A](a: B): MyList[B] = ???  // SUPER IMPORTANT
    }                                        // when using Covariant Animal, method add can add Dog or Cat
                                             // so the list has cat and dog which is mess
                                             // we can not do that, so when we add cat and dog, we need to change all to Animal
                                             // Finally, we return list of Animal!!!!!
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
    class BlackCat extends Cat
    // COVARIANCE: List[Cat] extends List[Animal]  because Cat extends Animal
    class CovariantList[+A] {
      def add[B >: A](element: B): MyList[B] = new MyList[B]
    }
    val animal: Animal = new Cat
    val animalList: CovariantList[Animal] = new CovariantList[BlackCat]


    // INVARIANCE: List[Cat] not extends List[Animal]
    class InvariantList[A]
    val indvariantAnimalList: InvariantList[Animal] = new InvariantList[Animal] // can not be cat

    // CONTRAVARIANCE    converse and Cat extends Animal
    class ContravariantList[-A]
    val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal] // converse!!!! <----

    // bounded types
    // uppder bound           // >: lower bound     ====> only can be supertype by xx
    class Cage[A <: Animal](animal: A)  // A only can be subtype of Animal
    val cage = new Cage(new Cat)

    class Car
   // val newCage = new Cage(new Car)

    // Upper bound
    class Book
    class eBook extends Book
    class rBook extends Book
    class nBook


    // how to use upper bound
    class ListBooks[B <: Book](book: B) {
      val b = book
    }
    //   ListBooks[Book] ::set the bound B must be the subtype of Book
    //   (book: B) here must be new xxx which is subtype of Book or ifself
    val lob0 = new ListBooks[Book](new Book)
    val lob1 = new ListBooks[Book](new eBook)
    val lob2 = new ListBooks[Book](new rBook)
    // nBook isnot subtype of Book, so it error
    // val lob3 = new ListBooks[Book](new nBook) <--- error

    // how to use lower bound
    class ArrayBooks[B >: Book](book: B) {
      val c = book
    }
    val arrb0 = new ArrayBooks[Book](new eBook)


    // MY EXPERIECNE:  <::------ !!!
    // + (supertype)
    // - (subtype)



  }
}
