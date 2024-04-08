object ScalaTutorial1 {
  def main(args: Array[String]){
    var i = 0
    while (i <= 10) {
      println(i)
      i += 1
    }
  }
}


object ScalaTutorial2 {
  def main(args: Array[String]){
    var i = 0
    do {
      println(i)
      i += 1
    } while (i <= 20)
  }
}

object ScalaTutorial3 {
  def main(args: Array[String]){
    var i = 0
    for (i <- 1 to 10)
      println(i)
  }
}

object ScalaTutorial4 {
  def main(args: Array[String]){
    var i = 0
    val randLetters = "ADNSKFJSIHFSNFISBFS"
    for(i <- 0 until randLetters.length)
      println(randLetters(i))
  }
}

object ScalaTutorial5 {
  def main(args: Array[String]){
    var i = 0
    var aList = List(1,2,3,4,5)
    for(i <- aList) {
      println("List Item " + i)
    }
  }
}

object ScalaTutorial6 {
  def main(args: Array[String]){
    var i = 0
    var evenList = for {i <- 1 to 20
                        if (i % 2 == 0) } yield i
    for(i <- evenList)
      println(i)
    }
}

//in Scala, the <- symbol in for-comprehensions can be thought of as equivalent to the in keyword used in Python's for loops and list comprehensions.
// Both <- in Scala and in in Python are used for iterating over elements in a collection or sequence.
// They serve a similar purpose in that they bind each element from the collection to a variable for processing within the loop or comprehension.

//Here's a comparison between Scala's for-comprehension using <- and
 //Python's for loop using in:
//numbers = [1, 2, 3, 4, 5]
//for num in numbers:
//  print(num)

// Scala
val numbers = List(1, 2, 3, 4, 5)
for (num <- numbers) {
  println(num)
}




object ScalaTutorial7 {
  def main(args: Array[String]) {
    var i = 0
    for(i <- 1 to 5; j <- 6 to 10){

      println(i * j)
    }

  }
}


object ScalaTutorial8 {
  def main(args: Array[String]) {
    var i = 0
   def printPrime(): Unit = {
     val primeList = List(1,2,3,5,7,11)
     for(i <- primeList){
       if(i == 11){
         return /* this is how you do Break statement in scala */
       }
       if(i != 1){
         println(i)
       }
     }
   }
  printPrime()
  }
}
 //=======================================================================//
