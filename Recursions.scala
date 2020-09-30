package lectures.part1basics

import scala.annotation.tailrec

object Recursions extends App   {

  //TRADITIONAL RECURSION WILL ALWAYS GIVE STACKOVERFLOW ERROR once the number is crossed
  // We need to do a TAIL recursion in SCALA
  // In TAIL Recursion the recursive function should be the last expression

  @tailrec
  def aTailRecursionFactorial(n: Int, accumulator: Int): Int = {
    if(n <= 1) accumulator
    else aTailRecursionFactorial(n-1, n * accumulator)
  }

  @tailrec
  def aConcatFunctionWithTailRecusrion(n: Int, aString: String, accum: String): String = {
    if(n <= 0) accum
    else aConcatFunctionWithTailRecusrion(n-1, aString, aString + accum)
  }
  println(aConcatFunctionWithTailRecusrion(2, "nayan", ""))

  def isPrimeTailRecursion(n: Int): Boolean = {
    @tailrec
    def primeUntil(check: Boolean, t : Int): Boolean = {
      if(!check) false
      else if(t <= 1) true
      else primeUntil((n % t) != 0, t-1)
     }

    primeUntil(true, n/2)

  }
  println(isPrimeTailRecursion(14331217))

  @tailrec
  def aFactorialTailRecursion(n: Int, acc: Int): Int = {
    if(n <=1) acc
    else aFactorialTailRecursion(n-1, n * acc)
  }

  println(aFactorialTailRecursion(5, 1))

  //fibonacci with tail recursive
  // find out how many state we have to maintain , and that many need to be there as accumulator

}
