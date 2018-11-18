package lecture.part1base

object ValuesVariableTypes extends App {
  val x  = 42      // val is immutable
                   // compiler can infer types
  // Value
  // Int Boolean Char Shore Long Float
  val a : Int = 32
  val b : Boolean = true // false
  val c : Char = 'c'
  val d : Short = 16
  val e : Long = 32
  val f : Float = 32f
  val g : Double = 64.0

  // Variable
  var aVariable : Int = 4
  aVariable = 5      // side effects
  var mutable = 1  // variable just mutable original type
                   // mutable can just be Int


}
