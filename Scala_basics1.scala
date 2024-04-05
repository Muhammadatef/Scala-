// Using InteliJ
//List("Hello", "World").mkString("", ", ", "!")

val number:Int = 10 // immutable, can't be changed
println(number)

var number2:Int = 2 // mutable, can be changed
println(number2)
// how to create a function in scala 

def multiplyBy2(number:Int, number2:Int) = number * number2
  
println(multiplyBy2(number,number2))




// Java and Scala Compatability
import java.util
import scala.jdk.CollectionConverters._

object WithJava extends app {

  val numbersInJava: util.List[Int] = util.Arrays.asList(1,2,3,4)
  val numbersInScala: scala.collection.mutable.Buffer[Int]= numbersInJava.asScala

  numbersInScala.foreach(number => println(number))

}
