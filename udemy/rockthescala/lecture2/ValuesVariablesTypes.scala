package playground
package udemy.rockthescala.lecture2

object ValuesVariablesTypes extends App {
  // val = values in scala - immutable and cannot be changed
  val x: Int = 45;
  println(x)

  val aString: String = "hello me"

  println(aString)

  val a: Boolean = true;

  // These are variable and the values can be changed (this is not a good practice)
  var xVariable = 5
  xVariable = 10

}
