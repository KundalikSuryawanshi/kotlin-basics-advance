package AdvanceKotlin

/*
* kotlin is an official language of android , announced by google IO in 2017
* kotlin also work on JVM
* kotlin was introduced by jet brains in 2011
* kotlin is statically type or object oriented functional programming language
* kotlin will reduce boyler plate lines of code
* no semicolon is used at the end of line in kotlin
* java and kotlin is interportable so java code aslo work in kotlin
*/

/*kotlin introduce by jetbrains in 2011 & it is the official language of android announced by google i/o in 2017
    * kotlin work on jvm and it reduce boyer plat code , no semicolon required at the end of code line
    * kotlin is the statically type language , kotlinlang.org - official documentation of kotlin*/
/*
fun AdvanceKotlin.main(args : Array<String>){
        println("hello world!")
        }

/*
fun AdvanceKotlin.main(){
    var kunil = Student() //it is the object of student class,
    // no need to specify new keyword at the time of object creation
    kunil.name = "gaurav"
    println(kunil) // it will print class name and hashcode
    println("name is "+kunil.name) //concatinatioin also work
    println("name is :${kunil.name}") //

    var gaurav = Student()
    gaurav.name = "cs"
    println("${gaurav.name}") // $ it will replace the value which is stored
    //JVN - java native interface is used to use c language code inside the java
}
class Student {
    var name: String = ""
*/
/*
var and val this is the two type of variable
var is used to declare normal variable
val is used to declare final or constant type of variable
we cannot change the value store in val variable
 *//*

}*/

/*fun AdvanceKotlin.main(){
    var obj = Student() //object of java class in kt
    obj.name = "gaurav" // it will directly assign value in java class in name variable
    println("${obj.name}")
    println(obj)
}*/
/*      operators in kt     */
/*fun AdvanceKotlin.main(){
    add(3,4)
    sub(5,4)
    mul(2,2)
    div(4,2)
    rem(4,2)
}
fun add(a:Int,b:Int){
    println(a+b)
}
fun sub(a:Int,b:Int){
    println(a-b)
}
fun mul(a:Int,b:Int){
    println(a*b)
}
fun div(a:Int,b:Int){
    println(a/b)
}
fun rem(a:Int,b:Int){
    println(a%b)
}*/

/*      conditionals      */
/*in kotlin we can use ei else as an expression*/
/*
fun AdvanceKotlin.main(){
    method1()
    method2()
}
fun method1() {
    var num1:Int = 3
    var num2:Int = 4
    var result:Int =0
    result = if (num1>num2) //the result of expression stored in result variable
                num1
             else
                num2
    println(result) // output is 4 means it print result of an expression
}
fun method2():Int{ //this Int is a return type of function
    var num1:Int = 3
    var num2:Int = 4
    var result:Int =0
    if(num1>num2)
        return num1
    else
        return num2
    println(result)
    // ternary operator is also used here
    //when you use if condition block then else block should be must
}*/
/*      String AdvanceKotlin.comparison     */
/*fun AdvanceKotlin.main() {
    var str1: String = "Gaurav"
    var str2: String = "gaurav"

    if (str1.equals(str2,true)) // it will ignore case
        println("strings are same..")
    if (str1.equals(str2))
        println("strings are same...") //it will check case also
    else
        println("strings are not same..")
    if (str1==str2) // it will also check the case
        println("strings are same...")
    else
        println("strings are not same..")
}*/
/*      null handling      */
/*
* in the string variable we cannot assign null variable
* so at we cannot face null pointer exception
* if you want to allow put null inside the string then put (?) question mark to the front of string
* var str : String? = null
* whenever you use question mark then at that time you handle null exception so its provide more stability to code
*/
*/




//changes date 7/1/2021
/*kotlin introduce in 2011 by jetbrains and in 2017 google i/o announced kotlin is the official language of android
* kotlin is statically type language it works on jvm & it reduce boyeler plat code*/

//AdvanceKotlin.main function take string type of arguments string support all type of data type

    /*var - regular type of variable value of var can be changed
    * val - constant type of variable value of val cannot be changed (like a final keyword)
    * to create object of any class no need to new keyword
    * we can also use java and kotlin together
    * after the compling both java as well as kotlin files gives .class file which covert into byte code with the help of jvm
    * we have option in intelij ide to convert java code into kotlin
    * to decompile .class file use "www.javadecompiler.com" */

//fun AdvanceKotlin.main(args:Array<String>) {
//    class Student()
//    {
//        var name : String = " "
//        var nameis : String? = null//for null handling function
//        //if ? not use then it gives null pointer exception
//    }
//
//    objectDemo() // call to the object demo function
//    AdvanceKotlin.OperetorDemo() // call to mathematical operator demo function
//    AdvanceKotlin.ConditionalDemo() //call to conditional function
//    AdvanceKotlin.comparison() // call to string AdvanceKotlin.comparison function
//    nullHandling() // call to the null handling function
//    AdvanceKotlin.whendemo() // call to the AdvanceKotlin.whendemo function
//    AdvanceKotlin.LoopRangeDemo() // call to the loop range demo function
//}
/*fun objectDemo(){
    print("hello ")
    val nickname = Student() //object of student class
    nickname.name = "kundalik"
    println("Mister " +nickname.name)
    println("name is: ${nickname.name}")
}*/

/*      operator        */
fun OperetorDemo(){
    var num1 : Int = 123
    var num2 : Int = 323
    var add : Int = num1 + num2
    println(add)
    var sub : Int = num1 - num2
    println(sub)
    var mul : Int = num1 * num2
    println(mul)
    var div : Int = num1 / num2
    println(div)
    var mod : Int = num1 % num2
    println(mod)
// all mathematical and logical operator work similar to the java
}
/*      conditionals        */
fun ConditionalDemo(){
/*in the kotlin we can use conditional like expression it means we can store the result of if else block in variable and */
    var fnum : Int = 5
    var snum : Int = 7
    var result : Int = 0
    result = if (fnum > snum)
        fnum
    else
        snum
    println("result of expression is:$result")
    // we can also use ternary operator  variable = (exp1 ? exp2 : exp3)
    //in if else both bock is required
}

/*      String AdvanceKotlin.comparison       */
fun comparison(){
    var string1 : String = "kundalik"
    var stirng2 : String = "Kundalik"
    //method 1
    if (string1.equals(string1,true))//it will ignore case just check whether strings are similar or not
        println("strings are same !")
    else
        println("strings are not same !")
    //method 2
    if (string1.equals(stirng2))// it also checks case sensitivity
        println("strings are same !")
    else
        println("strings are not same !")
    //method 3
    if (string1 == stirng2) //it also checks case sensitivity
        println("strings are same !")
    else
        println("strings are not same !")
    //we  can also use not equal to operator (!=)
}
/*      null handling       */
/* in the string value we cannot assign null value so in future we do not face null pointer exception
* if we want to put null in the string then
* var Str : String? = null   if you use nullable string then we have to use question mark ( ? )
* whenever we use ? then we handle the null pointer exception it will provide more stability
* */

/*fun nullHandling(){
    var str : String? = null
    var isObjects : Student? = Student()
    isObjects = null
    print("value assigned in string with help of object , isObject is :")
    println(isObjects?.name)
}*/
/*      when Expression      */
/*
* when expression in kt is similar to the switch case in java or c
* in kt we can use when expression it can store and return result
*/
fun whendemo(){
    var num : Int = 2
    var str = when (num)
    {
        1->"one"
        2->"two"
        3->"three"
        4->"four"
        5->"five"
        else->"give proper input"
    }
    println("str is $str")
}
/*       loops and Range          */
//in kotlin while and do while loops similar to the java
//in the range we will also work with character ex (a..z)
fun LoopRangeDemo(){
    var nums = 1..15 //it is the range in kotlin
    for(i in nums) // in operator will print the element between the range
        println(i)//i is just variable to move run the loop
    stepKT() //caling of AdvanceKotlin.stepKT function in AdvanceKotlin.main function
    rangeReverse() // calling to AdvanceKotlin.rangeReverse function
    rangeUntil() // calling to AdvanceKotlin.rangeUntil function
    countRange() // calling to AdvanceKotlin.countRange function

}
fun stepKT(){
    print("range steps function")
    var nums = 1..20 //define range from 1 to 20
    for (i in nums step 2) // step will increment range by no. of given steps
        println(i)
}
fun rangeReverse(){
    print("range reverse function")
    var nums = 16 downTo 1 // down to method will print range in reverse order
    for (i in nums) //no curly braces require to the single line in loops and range
        println(i)
    for (i in nums.reversed()) // .reversed method also print range in reverse order
        println(i)
}
fun rangeUntil(){
    print("range until function")
    var nums = 1 until 15 //it work like a 1 < 15
    for(i in nums)
        println(i)
}
fun countRange(){
    var nums = 1..20 //define range from 1 to 20
    println(nums.count())// it will count the no. of element in range
}






/*          function expression         */
//we can use function as an expression we can store and return the value in the variable
//fun AdvanceKotlin.main(){
//    //add(4,5)
//    var result = add(10,20) //here result variable store the return value of function
//    println(result)
//    inlineadd(5,5) // call to the inlineadd function with named parameter passing
//    max(2,2)
//}
//fun add(a:Int,b:Int):Int // this Int is the return type of function
//{
//    return a+b
//}
////we cal also write it as
//fun inlineadd(a:Int,b:Int):Int = a+b
//
//fun max(a:Int, b:Int) : Int = if(a>b) a else b

// function calling itself it is known as recursion ex- fibonacci series
fun main() {
    fact()
}
fun fact(){
    var num = 7
    var fact = 1
    for (i in 1..num) {
        fact = fact * 1
    }
    println(fact)
}


/*          Try catch exception         */
/*          extension function         */
/*          infix and operator overloading         */
/*          recursion in kotlin         */
/*          tail recursion          */
/*          constructor         */
/*          inheritance         */
/*          interface            */
/*          data class          */
/*          object keyword      */
/*          companion object , anonymouse class , inner class   */
/*          backtick as escape character        */
/*          user input in kotlin        */
/*          array in kotlin         */
/*          list in kotlin          */
/*          filter map          */
/*          kotlin singleton        */
/*          lambda expression       */
/*          kotlin couroutin        */

//next task - data structure in kotlin

