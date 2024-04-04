// Pure Functions
//A pure function is a function that, given the same input, will always return the same output and does not have any observable side effects. 
//Side effects are changes in state that occur outside the function's scope, 
//like modifying a global variable or changing the content of a data structure.

// for example :

val x = "Hello, World"
val r1 = x.reverse
val r2 = x.reverse

//Here, reverse is a pure function. No matter how many times you call reverse on x, 
//you will always get "dlroW ,olleH" as the output, and x itself remains unchanged after each call.
//The operation doesn’t affect the outside world or the input variable itself; it simply takes x, reverses it, and returns the new string.

// Impure Functions
// An impure function, conversely, does not guarantee the same output for the same input, or it may have side effects.

//The second block of code illustrates this with a StringBuilder example:


val x = new StringBuilder("Hello")
val r1 = x.append(", World").toString
val r2 = x.append(", World").toString

// Here, append is an impure function. 
// It changes the state of the StringBuilder object x by adding ", World" to it. 
//Therefore, when you call x.append(", World").toString the first time, you get "Hello, World". 
//But the second call to x.append(", World").toString results in "Hello, World, World" because x has been modified by the first call.



