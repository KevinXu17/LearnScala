package lecture.part1base

object Expression extends App{
  val x = 1 + 2 // EXPRESSION

  // Instruction (Do sth) VS Expression (evaluate return sth)

  val aCondition = false
  val aConditionValue = if (aCondition) 100 else 1 // IF expression

  var i = 0
  while (i < 10) { // WHILE
    println(i)
    i += 1
  }

  var aVariable = 3
  val aWeirdValue = (aVariable = 4) // Unit === void

  // Code Blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 3) "bigger 3" else 3
  }
}
