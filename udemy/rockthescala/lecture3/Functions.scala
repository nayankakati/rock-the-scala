package playground
package udemy.rockthescala.lecture3

object Functions extends App {
  def function(a: String, b: Int): String = {
    a + " " + b
  }
  println(function("hello", 3))

  def aRepeatedFunction(a: String, n: Int): String = {
    if (n == 1) a
    else a + aRepeatedFunction(a, n-1)
  }
  println(aRepeatedFunction("hrllo ", 3))

  // WHEN YOU NEED LOOP, USE RECURSION

  def aFunctionWithSideEffects(aString: String) : Unit = println(aString)

  def aBigFunction(n: Int) : Int = {
    def aSmallFunction(a: Int, b: Int): Int = a+b
    aSmallFunction(n, n-1);
  }
  println(aBigFunction(5))

  def aGreetingfunction(name: String, age: Int): String = {
    s"Hi, my name is $name and I am $age years old."
  }

  println(aGreetingfunction("Nayan", 33))
  def aFactorialFunction(n: Int) : Int = {

    if(0 == n) 1
    else n * aFactorialFunction(n-1)
  }
  println(aFactorialFunction(3))

  def aFibonacciFunction(n: Int): Int = {
    if(n <= 2) 1
    else aFibonacciFunction(n-1) + aFibonacciFunction(n-2)
  }
  println(aFibonacciFunction(8))


  def checkPrime(n: Int): Boolean = {
    def checkUntill(t: Int): Boolean = {
      if (t <= 1) true
      else (n % t) != 0 && checkUntill(t-1)
    }
    checkUntill(n/2)
  }

  println(checkPrime(13))
}
