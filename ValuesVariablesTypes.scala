package Part1Basics

object ValuesVariablesTypes extends App {
    val x: Int = 42 // VALS ARE IMMUTABLE, TYPE OF VALs are optional (: Int)
  // because COMPILER can infer types
    println(x)
  val aString: String = "Hello, RockTheJVM!"
  val bString = "GoodBye RockTheJVM!"

  val aBoolean: Boolean = true
  val aChar: Char = 'A'
  val anInt: Int = 74
  val aShot : Short = 3884
  val aLong : Long = 374934383L
  val aFLoat : Float = 322.34f
  val aDouble : Double = 3.14

  // Variable

  var aVariable: Int = 44
  // Can be reassigned
  aVariable = 55 // Side effects

  }
