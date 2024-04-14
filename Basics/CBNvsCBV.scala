package lectures.part1basics

object CBNvsCBV extends App {

  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  calledByValue(1257387745764245L)
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  //  printFirst(infinite(), 34) // stack overflow
  printFirst(34, infinite())
}

# Call by Value (CBV):

```scala
// In call by value, the argument expression is evaluated and its result is bound to the parameter name.
// The argument expression is evaluated only once, regardless of how many times it's used within the function body.
def callByValue(x: Int): Unit = {
    println("x1 = " + x)
    println("x2 = " + x)
}

val y = 10
callByValue(y)


/* output 
x1 = 10
x2 = 10
*/

// In call by name, the argument is not evaluated before being passed to the function.
// Instead, the argument is evaluated each time it's used within the function body.
// This evaluation strategy delays the evaluation of the argument until it's needed, potentially reducing unnecessary computations.
// Call by name is denoted by using => in the parameter list.
def callByName(x: => Int): Unit = {
    println("x1 = " + x)
    println("x2 = " + x)
}

val y = {
    println("evaluating y")
    10
}

callByName(y)

/*
OUTPUT : 
evaluating y
x1 = 10
evaluating y
x2 = 10


// In the call by name example, notice that the y expression is evaluated each time it's used within the callByName function, resulting in "evaluating y" being printed twice.

// Key Differences:

// - Call by value evaluates the argument once and passes the result to the function.
// - Call by name evaluates the argument each time it's referenced within the function.
// - Call by name can be more efficient when the argument expression is complex and not always needed.

*/
