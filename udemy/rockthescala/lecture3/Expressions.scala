package playground
package udemy.rockthescala.lecture3

object Expressions extends App {
    val x = 1 + 2 // Expression
    println(x)

  // Instructions (ask to DO)  vs Expressions (which has a value)

  // IF expression returns a value
  //If expression
  val aCondition = true;
  val aConditionValue = if(aCondition) 3 else 5 // If expression not instruction
  println(aConditionValue) // prints 3 returned from If above


  // Never write a loop in scala its not recommended
  // Everything in SCALA is an expression
  // We wil learn new way of data manipulation
  var aVariable = 4;
  val wierdValue = (aVariable = 3) //return type is Unit -> Void in other languages
  println(wierdValue) // prints ()
  // reassigning a variable is a side affect meaning it will return ()
  // side effects in scala is actly expressions returning Unit
  // examples = println(), vars, reassigning

  // code blocks
  val aCodeBlock = {
    val y: Int = 3
    val z: Int = y + 1

    if (z > 2) "wow" else "bogus"
  }
  println(aCodeBlock)
}
