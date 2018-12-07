@file:JvmName("MyCustomKotlinFileName")

package com.mykotlin

import com.myjava.MyJavaFile
import java.lang.NullPointerException
import java.math.BigInteger

val pi: Float by lazy {
    3.14f
}

fun main(args: Array<String>){

    /*
    var area = MyJavaFile.getArea(10,5)
    println("Printing area from Kotlin file : " + area)
    */

    /*
    var result = findVolume(2,3,30)
    print(result)
    */

   // findVolume2(2,3,30)
    /*
    var student = Student()
    println("Pass status: " + student.hasPassed(57))

    println("Scholarship Status: " + student.isScholar(57))
    */

    /*
    val str1:String = "Hello "
    val str2:String = "World"
    val str3:String = "Hey "

    println(str3.add(str1, str2))
    */

    /*
    val x:Int = 6
    val y:Int = 10

    //val greaterVal = x.greaterValue(y)   //Extension Way
    val greaterVal = x greaterValue y  //InFIX way

    println(greaterVal)
    */

   // println(getFibonacciNumber(100000, BigInteger("1"), BigInteger("0")))

    /*
    var student = Student1("Sriyank", 10)
    print(student.id)
    */

    /*
    var dog = Dog()
    dog.breed = "labra"
    dog.color = "black"
    dog.bark()
    dog.eat()

    var cat = Cat()
    cat.age = 7
    cat.color = "brown"
    cat.meow()
    cat.eat()

    var animal = Animal()
    animal.color = "white"
    animal.eat()
    */

    /*
    var dog = Dog()
    dog.eat()

    var cat = Cat()
    cat.eat()

    var animal = Animal()
    animal.eat()
    */
/*

    var dog = Dog()
    dog.eat()
    println(dog.color)
*/
 //   var dog = Dog("Black","Pug")

  //  var dog = Dog2("Black","Pug")
  //    var person = Person()
/*
    var myBtn = MyButton()
    myBtn.onTouch()
    myBtn.onClick()
*/

    /*
    var user1 = User("Sam", 10)
    var user2 = User("Sam", 10)

    println(user1)

    if (user1 == user2) {
        println("Equal")
    }else {
        println("Not Equal")
    }

    var newUser = user1.copy(name = "Peter")
    println(newUser)
*/
/*
    CustomersData.count = 98
    CustomersData.typeOfCustomers()
    println(CustomersData.count)
    CustomersData.count = 109
    println(CustomersData.count)

    CustomersData.myMethod("Hello")
*/
    /*
    MyClass.count
    MyClass.typeOfCustomers()
    */
/*
    val program = Program()

    program.addTwoNumbers(2,7)  // Simple way.. for Better Understanding

    program.addTwoNumbers(2,7, object : MyInterface{
        override fun execute(sum: Int) {
            println(sum)   // Body
        }
    })

    val test: String = "Hello"

    val myLambda:  (Int)  -> Unit = { s: Int -> println(s) } // Lambda Expression [Function ]

    program.addTwoNumbers(2,7, {s: Int -> println(s)})
*/

 //   val program = Program3()
 //   var result = 0

 //   val myLambda: (Int, Int) -> Int = { x,y  : Int -> x + y }  // Lamgda Expression [Function]
 //   program.addTwoNumbers(2,7,{ x,y  -> x + y })  // or
 //   program.addTwoNumbers(2,7) { x,y  -> x + y }   // or
 //   program.addTwoNumbers(2,7) {x, y -> result = x + y}  // or
 //   println(result)

  //    program.reverseAndDisplay("hello", { it.reversed() } )
/*
    var person = PersonX()


    with(person) {
        person.name = "Sriyank"
        person.age = 23
    }

    person.apply {
        person.name = "Sriyank"
        person.age = 23
    }.startRun()

    println(person.name)
    println(person.age)
*/
    // Arrays Tutorial

    // Elements:  0 0 0 0 0 0
    // Index:     0 1 2 3 4 5


    var myArray = Array<Int>(6) { 0 }  // Mutable. Fixed Size.
    myArray[0] = 32
    myArray[3] = 54
    myArray[1] = 11

    for (element in myArray) {
        println(element)
    }




    // List Tutorial

    // Elements:  0 0 0 0 0 0
    // Index:     0 1 2 3 4 5
    /*
    var list = listOf<String> ("Yogi", "Manmohan", "Vajpayee")  // Immutable. Fixed Size, Read ONLY

    println()

    for (index in 0..list.size - 1) {
        println(list[index])   // list.get(index)
    }

    for (element in list) {
        println(element)
    }

    var list2  = mutableListOf<String>() // mutable. No Fixed Size, Can Add or Remove
    var list3  = arrayListOf<String>()   // mutable. No Fixed Size, Can Add or Remove
    var list4  = ArrayList<String>()     // mutable. No Fixed Size, Can Add or Remove


    list2.add("Yogi")
    list2.add("Manmohan")
    list2.add("Vajpayee")

    // Either using two lines of code to remove then add at that location or replace at that location
    list2.remove("Manmohan")
    list2.add(1, "Modi")

    // or

    list2[1] = "Modi"

    for (element in list2) {
        println(element)
    }

    println()

    for (index in 0..list2.size - 1) {
        println(list2[index])   // list.get(index)
    }

    list3.add("Yogi")         // 0
    list3.add("Manmohan")     // 1
    list3.add("Vajpayee")     // 2

    // Either using two lines of code to remove then add at that location or replace at that location
    list3.remove("Manmohan")
    list3.add(1, "Modi")

    // or

    list3[1] = "Modi"

    for (element in list3) {
        println(element)
    }

    println()

    for (index in 0..list3.size - 1) {
        println(list2[index])   // list.get(index)
    }

    list4.add("Yogi")
    list4.add("Manmohan")
    list4.add("Vajpayee")

    // Either using two lines of code to remove then add at that location or replace at that location
    list4.remove("Manmohan")
    list4.add(1, "Modi")

    // or

    list4[1] = "Modi"

    for (element in list4) {
        println(element)
    }

    println()

    for (index in 0..list4.size - 1) {
        println(list4[index])   // list.get(index)
    }
    */

    // Map Tutorial : Key-Value Pair

    /*
    var myMap = mapOf<Int, String>(2 to "Yogi", 43 to "Manmohan", 7 to "Majpayee")     // Immutable, Fixed Size, READ ONLY

    for (key in myMap.keys) { // Using Individual Element (Objects)
        println(myMap[key])   //myMap.get(key)
        println("Element at Key: $key = ${(myMap[key])}")  //myMap.get(key)
    }

    var myMap2 = HashMap<Int, String>()     // Mutable, READ and WRITE both, No Fixed Size
    var myMap3 = mutableMapOf<Int, String>()     // Mutable, READ and WRITE both, No Fixed Size // LinkedHashMap
    var myMap4 = hashMapOf<Int, String>()     // Mutable, READ and WRITE both, No Fixed Size

    myMap2.put(4, "Yogi")
    myMap2.put(43, "Manmohan")
    myMap2.put(7, "Vajpayee")

    myMap2.replace(43, "Modi")

    myMap2.put(43, "Modi")

    for (key in myMap2.keys) { // Using Individual Element (Objects)
        println(myMap2[key])   //myMap.get(key)
        println("Element at Key: $key = ${(myMap2[key])}")  //myMap.get(key)
    }
    */

    // "Set" contains unique elements
    // "HashSet" also contains unique elements but Sequence is not guaranteed in output

    /*
    var mySet = setOf<Int>( 2, 54, 3, 1, 0, 9, 9, 9, 8) // Immutable. READ Only
    var mySet2 = mutableSetOf<Int>( 2, 54, 3, 1, 0, 9, 9, 9, 8) // Mutable Set. READ and WRITE both
    var mySet3 = hashSetOf<Int>( 2, 54, 3, 1, 0, 9, 9, 9, 8) // Mutable Set. READ and WRITE both

    mySet2.remove(54)
    mySet2.add(100)


    for (element in mySet) { // Using Individual Element (Objects)
        println(element)
    }

    for (element in mySet2) { // Using Individual Element (Objects)
        println(element)
    }

    for (element in mySet3) { // Using Individual Element (Objects)
        println(element)
    }
    */

    /* FILTER
       Returns a list containing only elements matching the given [predicate].

       Map
       Returns a list containing the results of applying the given [transform] function
       to each element in the original collection.
       */

    /*
    val myNumbers: List<Int> = listOf(2, 3, 4, 6, 23, 90)

    val mySmallNums = myNumbers.filter { it < 10 }  // or {v -> v < 10 }

    for (num in mySmallNums) {
        println(num)
    }


    val mySquaredNums = myNumbers.map { it * it} // or {num -> num * num }

    for (num in mySquaredNums) {
        println(num)
    }

    val mySmallSquaredNums = myNumbers.filter { it < 10}
                                                .map {it*it}

    for (num in mySmallSquaredNums) {
        println(num)
    }

    var people = listOf<PersonY>(PersonY(10, "Sriyank"), PersonY(23, "Annie"), PersonY(17, "Sam"))
    var names = people.filter {it.name.startsWith("S")}.map {it.name}

    for (name in names) {
        println(name)
    }
    */

    /*
    val myNumbers = listOf(2, 3, 4, 6, 23, 90)

    val myPredicate = {num:Int -> num > 10 }

    val check1 = myNumbers.all(myPredicate)  // Are all elements greater than 10?
    println(check1)

    val check2 = myNumbers.any(myPredicate)  // Do any these elements satisfy the Predicate?
    println(check2)

    val totalCount = myNumbers.count (myPredicate)  // Number of elements that satisfy the Predicate
    println(totalCount)

    val num = myNumbers.find (myPredicate)   // Returns the first number that matches the Predicate
    println(num)
    */

    // Wap to find out length of name
    /*
    val name: String? = "Steve"

    // 1. Safe Call ( ?. )
    //   Returns the length if 'name' is nto null else returns NULL
    //   Use it if you don't mind getting NULL value

    println("The length of name is ${name?.length}")

    // 2. Safe Call with let ( ?.let )
    // It executes the block ONLY IF name is NOT NULL

    name?.let {
        println("The length of name is ${name.length}")
    }
    // 3. Elvis-operator ( ?: )
    // When we have nullable reference 'name', we can say "Is name is not null", use it,
    // otherwise use some non-null value"

   val len = if (name != null)
       name.length
    else
       -1

    val length = name?.length ?: -1

    println(length)

    // 4. Non-null assertion operator (!!)
    // Use it when you are sure the value is NOT NULL
    // Throws NullPointerException if the value is found to be NULL

    print("The length of name is ${name!!.length}")
    */

    /*
    val country = Country()

    country.name = "India"
    println(country.name)

    country.setup()
    */
/*
    println("Some initial code....")

    val area1 = pi * 4 * 4

    val area2 = pi * 9 * 9

    println("Some more code.....")
*/
}

class Country {

    /* Rules with LateInit
       Use it with mutable variables [var]
       lateinit var name: String // Allowed
       lateinit val name: String // Not Allowed

       Allowed with only non-nullable data types
       lateinit var name: String // Allowed
       lateinit var name: String? // Not allowed

       It is a promise to compiler that t he value will be initialized in future

       Note: If you try to access lateinit variable without initializing it then it throws
       Uninitilized Property Access Exception

     */
    lateinit var name: String

    fun setup() {

        name = "USA"
        println ("The name of country is $name")
    }

}
class PersonY(var age: Int, var name: String) {
    // Some other code..
}
class Program {

    fun  addTwoNumbers(a: Int, b: Int, action: (Int)  -> Unit) {  // High Level Function with Lambda as Parameter

        val sum = a + b
        action(sum)    // println(sum)
      }

    fun  addTwoNumbers(a: Int, b: Int, action: MyInterface) {  // Using Interface / Object Oriented Way

        val sum = a + b
        action.execute(sum)
    }

    fun  addTwoNumbers(a: Int, b: Int) {  // Simple Way.. Just for better Understanding

        val sum = a + b
        println(sum) // Body
    }
}

class Program2 {

    fun addTwoNumbers(a: Int, b: Int, action: (Int, Int) -> Unit) {   // High Level Function with Lanbda as Parameters

       // val result = action(a,b)   //result = x + y = a + b = 2 + 7 = 9
       // println(result)
        action(a,b)

    }
}

class Program3 {

    fun reverseAndDisplay(str:String, myFunc: (String) -> String) {   // High Level Function with Lambda Expression

        var result = myFunc(str)    // it.reversed() --> str.reversed() ----> "Hello".reversed() = "olleh"
        println(result)

    }
}

class PersonX {

    var name: String = ""
    var age: Int = -1

    fun startRun() {
        println("Now I am ready to run")
    }
}
interface MyInterface {
    fun execute(sum: Int)
}
tailrec fun getFibonacciNumber(n: Int, a: BigInteger, b: BigInteger): BigInteger {

    if (n==0)
        return b
    else
        return getFibonacciNumber(n - 1, a + b, a)

}

// 0 1 1 2 3 5 8 13 21 .....

infix fun Int.greaterValue(other: Int): Int {  // Infix Function and also Extension function

    if (this > other)
        return this
    else
        return other
}
fun String.add(s1:String, s2:String): String {   // Extension Function ONLY
    return this + s1 + s2
}

fun Student.isScholar(marks: Int): Boolean {
    return marks > 95
}
fun add(a: Int, b: Int): Int {
    return a + b
}

@JvmOverloads

fun findVolume(length: Int, breadth: Int, height: Int = 10): Int{
   return length * breadth * height

}


fun findVolume2(length: Int, breadth: Int, height: Int = 10){

    println("Length is " + length)
    println("Breadth is " + breadth)
    println("Height is " + height)
}

class TestClass {

    // person.a, person.b are not visible because they are private and protected
    // person.c, person.c are visible because they are public and internal

    /*
    fun testing() {
        var person = Person()
        print(person.d)
        print(person.c)
        print(person.b)     //Can't acccess here
        print(person.a)     //Can't access here
    }
    */

}

data class User(var name:String, var id:Int) {}

open class MySuperClass {   // Behaves like STATIc variable
    open fun myMethod(str: String) {
        println("MySuperClass")
    }
}

object CustomersData : MySuperClass() {

    var count:Int = -1    // Behaves like STATIC variable

    fun typeOfCustomers(): String {  // Behaves like STATIC methods
        return "Indian"
    }

    override fun myMethod(str: String) {  // Currently, behaving like STATIC method
        super.myMethod(str)
        println("object CustomerData: " + str)
    }

    init {
        // Your Code...
    }
}

class MyClass {

    companion object {

        var count: Int = -1    // Behaves like STATIC variable

        fun typeOfCustomers(): String {  // Behaves like STATIC methods
            return "Indian"
        }
    }
}

interface MyInterfaceListener {    // you cannot create instance of an interface  class

   // var name: String // Properties in interface are abstract by default

    fun onTouch()    // Methods in interface are abstract by default
    fun onClick() {   // Normal Methods are public and open by default NOT FINAL
        println("onClick Interface code: onClick")
    }
}

interface MySecondInterface {    // you cannot create instance of an interface  class

  //  var name: String // Properties in interface are abstract by default

    fun onTouch()   {   // Normal Method
        println("MySecondInterfacce; onTouch")
    }
    fun onClick() {   // Normal Methods are public and open by default NOT FINAL
        println("MySecondInterface: onClick")
    }
}


class MyButton : MyInterfaceListener, MySecondInterface {
    override fun onClick() {
        super<MyInterfaceListener>.onClick()
        super<MySecondInterface>.onClick()
    }

    override fun onTouch() {
        super.onTouch()
    }

    // Body

  //  override var name: String = "dummy_name"
/*
    override fun onTouch() {
        println("Button was Touched")
    }

    override fun onClick() {   // Optional to override
        super.onClick()
        println("Button was Clicked")
    }
    */
}
abstract class Person {   // Super Class  You can not create an instance of an abstract class
   /*
    private val a = 1
    protected val b = 2
    internal val c = 3
    val d = 10   //Public by default

    */

    abstract var name: String

    abstract fun eat()       // abstract properties are "open" by default
    open fun getHeight() {}  // An "Open" Function ready to be overridden
    fun goToSchool() {}      // A Normal Function: public and final by default



}

class Indian: Person() {  // Derived Class or Sub class

    override var name: String = "dummy_indian_name"

    override fun eat() {

    }
    override fun getHeight() {}
    // a is not visible
    // b, c, d is visible

    /*
    fun test() {
        print(d)
        print(c)
        print(b)
        print(a)
    }
    */


}
class Student {
    fun hasPassed(marks: Int): Boolean {
        return marks > 40

    }
}

class Student1 (var name:String){

    var id: Int = -1
     init {
        println("Student has got a name as $name ")
    }

    constructor(n: String, id: Int): this(n) {
        // The body of the Secondary constructor is called after the init block
        this.id = id
    }
}

open class Animal(var color: String) {  //Super Class
    //open var color: String = "White"

    open fun eat() {
        println("Animal Eating")
    }

    init {
        println("From Animal Init: $color")
    }
}
class Dog(color: String, var breed: String) : Animal(color){  //Derived Class

   // var breed: String = ""

   // override var color: String = "Black"

    /*
    fun bark() {
        println("Bark")
    }

    override fun eat() {
        super<Animal>.eat()
        println("Dog is eating")
    }
    */

    init {
        println("From Dog Init: $color and $breed")
    }
}

open class Animal2 {  //Super Class

    var color: String = ""

    constructor(color: String){
        this.color = color

        println("From Animal2: $color")

    }
}
class Dog2: Animal2 {  //Derived Class

    var breed: String = ""

    constructor(color: String, breed: String): super(color) {
        this.breed = breed

        println("From Dog2: $color and $breed")
    }
}

class Cat(color: String, var breed:String) : Animal(color) {

    var age: Int = -1

    fun meow() {
        println("Meow")
    }

    override fun eat() {
        println("Cat is eating")
    }
}

/*
* 1. All Infix functions are extension functions, BUT not all extension functions are Infix
*
* 2. INFIX functions just have ONE Parameter
*
*/
/*
* public class MyCustomKotlinFileName {
*
*       public static void com.mykotlin.main(string[] args {
*
*       }
*
*      public static int com.mykotlin.add (int a, int b) {
*           return a + b;
*       }
* }
*
*  */