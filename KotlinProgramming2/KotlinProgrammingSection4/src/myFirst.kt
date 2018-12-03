/*   This is Section 4.3
fun main(args: Array<String>){
    var name: String
    name = "Kevin"

    var age: Int = 10
    var isAlive: Boolean = true
    var marks: Float = 97.4f
    var percentage: Double = 90.78
    var gender: Char = 'M'

    print(marks)
}
*/

/* This is section 4.4 */
/*
fun main(args: Array<String>){
    /*
    val name = "Sam"
    val str = "Hello $name"
    print("The Statement is $str. The number of characters in statement is ${str.length}")
    val a = 10
    val b = 5
    print("The sum of $a and $b is ${a + b}")
    */
    var rect = Rectangle()
    rect.length = 5
    rect.breadth = 3

    print("The length of rectangle is ${rect.length}  and breadth is ${rect.breadth}. The Area is ${rect.length * rect.breadth}")
}

class Rectangle {
    var length: Int = 0
    var breadth: Int = 0

}
*/

/* This is section 4.5
fun main(args: Array<String>) {

    val r1 = 1..5
// This range contains the number 1,2,3,4,5

    val r2 = 5 downTo 1
// This range contains the number 5,4,3,2,1

    val r3 = 5 downTo 1 step 2
// This range contains the number 5,3,1

    val r4 = 'a'..'z'
// This range contains the values from "a", "b", "c" .... "z"

    var isPresent = 'c' in r4

    var countDown = 10.downTo(1)
// This range contains the number 10,8,7,6,5,4,3,2,1

    var moveUp = 1.rangeTo(10)
// This range contains the number 1,2,3,4,5,6....10)
}
*/

/* This is section 5.1
fun main(args: Array<String>) {
  // IF as Expression

    val a = 2
    val b = 5

    var maxValue:Int = if (a > b) {
        print("a is greater")
        a
    } else {
        print("b is greater")
        b
    }

    println(maxValue)

}
*/

/* This is section 5.2
fun main(args: Array<String>) {

    // WHEN as Expression

    val x = 11
    when (x) {
        !in 1..20 -> println("x is ${x}")
        2 -> {
            println("x is 2")
        }
        else -> {
            println("x value is unknown")
            println("I don't know what is x")
        }
    }
}

*/

/* This is section 5.2
fun main(args: Array<String>) {

    // WHEN as Expression

    val x = 100



    var str:String = when (x) {
        1 -> "x is 1"
        2 -> "x is 2"
        else -> {
            "x value is unknown" +
            "x is an alien"
        }
    }

    println(str)
}
*/

/* This is Section 6
fun main(args: Array<String>) {
    // Loops in Kotlin
    // For Loop
    for (i in 1..10) {
        println(i)
    }
    for (i in 1..10) {
        if (i % 2 == 0)
            println(i)
    }

    // While Loop
    var i: Int = 1
    while (i <= 10) {
        println(i)
        i++
    }
    i = 1
    while (i <= 10) {
        if (i % 2 == 0) {
            println(i)
        }
        i++
    }
    i = 1

    do {
        println(i)
        i++
    } while (i <= 10)

    i = 1

    do {
        if (i % 2 == 0) {
            println(i)
        }
        i++
    } while (i <= 10)

    // Break statements

    for (i in 1..10) {
        println(i)
        if (i == 5)
            break
    }

    // Labeled For Loop
    myLoop@ for (i in 1..3) {
        for (j in 1..3) {
            println("$i $j")
            if (i == 2 && j == 2)
                break@myLoop
        }
    }

    // Continue Statement

    for (i in 1..10) {

        if (i == 5) {
            continue
        }
        println(i)
    }

    for (i in 1..10) {

        if (i % 2 == 0) {
            continue
        }
        println(i)
    }

    outer@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2)
                continue@outer
            println("$i $j")

        }
    }

}

*/

/* This is section 7.1
fun main(args: Array<String>) {
    var sum = add(2,4)
    println("Sum is " + sum)


}

fun add(a: Int, b: Int): Int  {
 //   var a = 2
 //   var b = 4
 //   var sum = a + b
 //   print ("Sum is ${a + b}")

    return a+b
}

*/

fun main(args: Array<String>) {
    var largeValue = max(4,6)

    println("The greater number is $largeValue")

}

fun max(a: Int, b: Int): Int
        = if (a > b) {
             println("$a is greater")
             a
          }else {
             println("$b is greater")
             b
           //  98
          }
/*
{
    /*
    if (a > b)
        return a
    else
        return b
    */

}

*/
/* This is section:
fun main(args: Array<String>) {


}
*/


