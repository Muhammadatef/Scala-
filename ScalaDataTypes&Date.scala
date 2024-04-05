// Import necessary classes for handling date and time
import java.time.{LocalDate, LocalTime, LocalDateTime, ZoneId}
import java.time.format.DateTimeFormatter

object DataTypesAndDateTime extends App {
  // Integer types
  val anInt: Int = 32
  val aShort: Short = 10
  val aLong: Long = 1234567890L
  val aByte: Byte = 127

  // Floating point types
  val aDouble: Double = 3.14
  val aFloat: Float = 2.0f

  // Character and String types
  val aChar: Char = 'A'
  val aString: String = "Hello, Scala!"

  // Boolean type
  val aBoolean: Boolean = true

  // Showing the data types
  println(s"Int: $anInt, Short: $aShort, Long: $aLong, Byte: $aByte")
  println(s"Double: $aDouble, Float: $aFloat")
  println(s"Char: $aChar, String: $aString")
  println(s"Boolean: $aBoolean")

  // Handling date and time
  val currentDate: LocalDate = LocalDate.now()
  val currentTime: LocalTime = LocalTime.now()
  val currentDateTime: LocalDateTime = LocalDateTime.now()
  
  // Formatting date and time
  val dateFormatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
  val timeFormatter: DateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss")
  
  println(s"Current Date: ${currentDate.format(dateFormatter)}")
  println(s"Current Time: ${currentTime.format(timeFormatter)}")
  println(s"Current DateTime: $currentDateTime")

  // Working with time zones
  val zoneId: ZoneId = ZoneId.of("America/New_York")
  val zonedDateTime = currentDateTime.atZone(zoneId)
  println(s"Current DateTime in New York: $zonedDateTime")
}

// In Scala, the s before a string literal indicates that the string is an interpolated string. This means you can embed variables directly within the string. The variables are enclosed in curly braces {} and are prefixed with a $ sign. If you're just referencing a variable and not performing any operations on it, you can omit the curly braces and use the $ sign followed by the variable name directly.

// For example, in the line:


println(s"Double: $aDouble, Float: $aFloat")

// $aDouble and $aFloat will be replaced with the values of the variables aDouble and aFloat, respectively, 
//when the string is constructed. This makes it easy to create strings that include the values of variables.

//String interpolation comes in handy for constructing strings from variables without the need to concatenate them manually. 
//Scala supports various forms of string interpolation, including:

// s for simple interpolation, as shown in your example.
// f for formatting strings, similar to printf in other languages, where you can specify the formatting of the embedded expressions.
// raw for raw strings that ignore escape sequences in literals.
// So, the s in thr example is a shorthand to indicate that the string is interpolated, allowing direct embedding of variable values into the string.









