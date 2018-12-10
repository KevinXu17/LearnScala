package lecture.part2OOP

import lecture.part2OOP.InheritanceAndTraits.Animal

import playground.{Rice => SuperRice}

object PackageingAndImports {
  def main(args: Array[String]): Unit = {

   // package members are accessible by their simple name
    val fish = new Animal  // import at the top


    // import the package by location file
    val rice = new playground.Rice

    // packages are in hierarchy
    // matching folder structure


    // package object (global)

    println(poj) // poj belong to package object
    val rice1 = new SuperRice  // change class name in import above
  }
}
