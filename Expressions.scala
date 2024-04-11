package Part1Basics

object Expressions extends App {

  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ..... side effects
  println(aVariable)



  // Instructions VS Expressions
  // An Instruction is something that you tell the computer to do (Imperative Languages ex. Python)

  //  Expression is something that has a value and or a type
  // In Scala, we think of terms of Expressions, that is every single bit of your code will compute a value

  // IF EXPRESSION
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3 // notice here that the output of the if expression is value, not doing smth
  println(aConditionValue)
  println(if(aCondition) 5 else 3) // if in scala, is an expression
  println(1+3)

  // in python would be like
  // if aCondition:
    // do something
  // else:
    // do something

  // ======================//

  var i = 0
  var aWHile = while (i < 10) { // side effects
    println(i)
    i += 1

    // PLEASE, NEVER WRITE THIS AGAIN. it has side effects.
    // EVERYTHING IS IN SCALA IS AN EXPRESSION
  }
  val aWeirdValue = (aVariable = 3) // Unit === void
  // side effects in Scala are actually expressions returning Unit
  // side effects : println(), whiles, reassigning


  // Code Blocks
  val aCodeBlock = {

    val y = 2
    val z = y + 1
    if (z > 2) "Hello" else "Goodbye"
    // a code block is an expression
    //a value of the code block is the value of its last expression.



  }
// Instructions are executed (Python). Expressions are evaluated(Scala)


  // Excercies
  // 1. difference between "hello world" vs println("hello world")?
  // Answer of 1. "Hello World" is String Literal, println("hello world") is an expression with Unit type because it doesn't return any meaningful value—it just performs an action.
  // 2.

  val someValue = {
    2 < 3
  }
  println(someValue) // True

  val someOtherValue = {
    if (someValue) 239 else 986
    42
  }
  println(someOtherValue) // 42, because the value of code block is the last expression which in this case is 42

}
