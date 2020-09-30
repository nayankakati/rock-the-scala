package lectures.part1basics

object CBNvsCBV extends App {

  def callByValue(x: Long): Unit = {
    println("by value"+ x)
    println("by value"+ x) // in call by value is fixed in every call
  }

  def callByName(x: => Long): Unit = {
    println("by name" + x) // in call by method the value is evaluated on every call .i.e System.nano
    println("by name" + x) // system.nano
    // by name paramtere delays the evaluations - its is evalutaed only when called for the first time
  }
  callByValue(System.nanoTime())
  callByName(System.nanoTime())
}
