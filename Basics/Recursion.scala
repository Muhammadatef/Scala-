package Part1Basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion extends App {
//  def factorial (n: Int): Int = {
//    if(n <= 1) 1
//    else {
//      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
//      val result = n * factorial(n - 1)
//      println("Computed factorial of " + n )
//
//      result
//    }
//
//  }
//  println(factorial(10))

// how to help with StackOverFlow Error if we try the method above to return factorial(5000)?  :
//  def anotherFactorial(n : Int): BigInt = {
//    @tailrec
//    def factHelper(x : Int, accumulator: BigInt): BigInt =
//      if (x <= 1) accumulator
//      else factHelper(x - 1, x * accumulator) // TAIL RECURSION = use recursive call as the last expression
//
//    factHelper(n,1)
//
//  }

  /*
  anotherFactorial(10) = factHelper(10,1)
  = factHelper(9,10 * 1)
  = factHelper(8, 9 * 10 * 1)
  = factHelper(7,8 * 9 * 10 * 1)
  = factHelper(6, 7 * 8 * 9 * 10 * 1)
  = ......
  = factHelper(2,3 * 4 * 5 * 6 * 7 .... * 10 * 1)
  = factHelper(1, 1 * 2 ..... * 10 * 1 )
  = 1 * 2 * 3 * 4 * ..... * 10 *
*/

//  println(anotherFactorial(5000))
  // WHEN YOU NEED LOOPS USE _TAIL_RECURSION.
  /*
  1- cocatenate a string n time using tailr recursion
  2- IsPrime function, tail recursive
  3-fibonaci function, tail recursive
   */

  @tailrec
  def ConcatenateTR(aString:String, n:Int, acc:String): String =
    if (n==0) acc
    else ConcatenateTR(aString, n-1, aString + acc)

  println(ConcatenateTR("Hello", 3, ""))



  def isPrimeTR(n:Int):Boolean = {
    def isPrimeTailrec(t:Int, isStillPrime:Boolean): Boolean =
      if(!isStillPrime) false
      else if (t<= 1) true
      else isPrimeTailrec(t-1, n % t != 0 && isStillPrime)


    isPrimeTailrec(n / 2, true)



  }

  println(isPrimeTR(2003))
  println(isPrimeTR(2014))

}

