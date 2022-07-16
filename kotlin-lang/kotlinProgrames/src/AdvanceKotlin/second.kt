package AdvanceKotlin

import java.util.*

/*
//class of students
class Student{
    var firstName = "kundalik"
    var lastName = "suryawanshi"
}

fun AdvanceKotlin.main(){
     val studentOne = Student()//objects of student class
    println(Student())
    println(studentOne.firstName)
    println(studentOne.lastName)
    studentOne.firstName = "Gaurav"
    println(studentOne.firstName)
    println(studentOne.lastName)
}*/

//constructor
/*
class Student(var firstName : String , var lastName :String){

}
fun AdvanceKotlin.main(){
    val studentOne = Student(firstName = "gaurav", lastName = "suryawanshi")
    println(studentOne.firstName)
    println(studentOne.lastName)

    val studentTwo = Student(firstName = "kundalik", lastName = "suryawanshi")
    println(studentTwo.firstName)
    println(studentTwo.lastName)
    println("my first student name is :${studentOne.firstName} ${studentOne.lastName}")

    //we also create new student list this
    val studentThird = Student("gaurav", "suryawanshi")
    println("my first student name is :${studentOne.firstName} ${studentOne.lastName}")
}*/

//Classes - property defaults, methods, custom getters and setters

/*class Student (var firstName: String , var lastName : String ="default_last_name"){
    init {
        println("student object initializing")
        //init block execute when constructor called
    }
    init {
        println("$firstName $lastName created" )
        //we can create multiple init
        *//*kotlin init-
         - the code inside the init block is to be executed when the class is instantiated
        * *//*
    }
}

fun AdvanceKotlin.main() {
    val studentOne = Student(firstName = "gaurav")//if last name not provide it wil take default value
    println()
}*/
//methods are also known as member function

/*
class Student(var firstName: String ="first name", var lastName : String ="last name") {

    fun printDetails() {*/
/*member function*//*

        println("first name : $firstName")
        println("last name : $lastName")
        println("full name : $firstName $lastName")
        println("enrolled in : Empty for now")
    }
}
    fun AdvanceKotlin.main()
    {
        val studentOne = Student("gaurav","suryawanshi")
        studentOne.printDetails() //call to the member function
    }
*/

//getters and setters (custom getters and setters)
/*

class Student(var firstName: String="First Name",var lastName:String="Last Name")
{
    var fullName : String= "$firstName $lastName"
    get(){
        return "${firstName.capitalize()} ${lastName.capitalize()}"
    }
    set(value){
        field = "you want to be $value but i've set it to bilbo begins"
    }
    fun printDetails(){
        println("first name : $firstName")
        println("last name : $lastName")
        println("full name : $firstName $lastName")
        println("enrolled in : Empty for now")
    }
}

fun AdvanceKotlin.main(){
    val studentOne = Student("gaurav","suryawanshi")
    println(studentOne.firstName)
    studentOne.fullName = "kundalik suryawanshi"
    println(studentOne.fullName)
}*/

//list of dagger retrofit firebase api integration

//secondary constructor
/*we don't need constructor keyword in primary constructor unless we modified that
* */
/*

class Student(var firstName:String="First Name", var lastName : String="Last Name"){

    var fullName:String = "$firstName $lastName"
    var listOfCources = mutableListOf<String>()

    constructor(firstName: String,lastName: String,listOfCources:MutableList<String>)
        :this(firstName,lastName){
            this.listOfCources = listOfCources
        }
    fun printDetails(){
        println("First name:$firstName")
        println("last name:$lastName")
        println("full name :$fullName")
        println("Enrolled in :$listOfCources")
        println("--------\n")
    }
}

fun AdvanceKotlin.main(){
    val sampleListOfCource = mutableListOf<String>("dagger","retrofit","data bases")
    val studentOne = Student ("gaurav","suryawanshi")
    studentOne.printDetails()
    val studentTwo = Student("kundalik","suryawanshi",sampleListOfCource)
    studentTwo.printDetails()

    studentOne.listOfCources = sampleListOfCource
    studentOne.printDetails()
}*/
//inheritance
//write open to allow inheritance by default its private

/*open class Person(var firstName: String = "First Name", var lastName: String = "Second Name") {
    var fullName: String ="$firstName $lastName"

    //member function
    fun printDetails(){
        println("First Name: $firstName")
        println("Last Name: $lastName")
        println("Full Name: $fullName")
    }
    fun run(){
        println("$fullName is running")
    }
    fun walk(){
        println("$fullName is walking")
    }
}
class InheritingStudent(firstName: String, lastName: String) : Person(firstName , lastName){
    //Person(firstName = firstName , lastName = lastName)
}
fun AdvanceKotlin.main(){
    val obj = InheritingStudent("gaurav", "suryawanshi")
    obj.printDetails()
    obj.walk()
    obj.run()
} */
//Inheritance continued - override, super, extending features and more
/*

open class Person(open var firstName: String ="First Name", open var lastName: String ="Last name" ){
    open val fullName: String="$firstName $lastName"

    open fun printDetails(){
        println("First Name:$firstName")
        println("Last Name:$lastName")
        println("Full Name:$fullName")
    }

    fun run(){
        println("$fullName is Running")
    }
    fun walk(){
        println("$fullName is Walking")
    }
}

class InheritingStudent(firstName: String,lastName: String,
                        var listOfCourses: MutableList<String> = mutableListOf<String>()):Person(firstName,lastName){
//if capitalise require then only else use without capitalise
    override var firstName = firstName.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    override var lastName = lastName.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    override val fullName: String="${this.firstName} ${this.lastName}"
//this keyword is used to refer current value from this class

    override fun printDetails(){
        super.printDetails()//super. refer and inherit implementation from parent person class
        if (listOfCourses.isNotEmpty()) println("Enrolled in:$listOfCourses") else println("not enrolled in any courses")
    }
}

class Student(var firstName: String="First Name", var lastName: String="Last Name") {
    var fullName: String= "$firstName $lastName"
    var listOfCourses = mutableListOf<String>()

    constructor(firstName: String,lastName: String,listOfCourses: MutableList<String>)
        :this(firstName,lastName){
            this.listOfCourses = listOfCourses
        }
    fun printDetails(){

    }
}
fun AdvanceKotlin.main(){
    val sampleListOfCourses = mutableListOf<String>("flutter","ReactNative","NativeAndroid")
    val gaurav = InheritingStudent("kundalik","suryawanshi",sampleListOfCourses)
    gaurav.printDetails()
}*/
/*

*/
/*lateinit property should be var and val it should not be float, int
 * lateinit is only type of String
 *
 *
 * //polymorphism
 * polymorphism said parent can holde reference of its child
 * parent can call methods of child classes (which are common)*//*


fun AdvanceKotlin.main(){
    val circle : Shape = Circle(4.0)
    val square : Shape = Square(4.0)

    // println(circle.area())
    //println(square.area())

    val shapes = arrayOf(Circle(3.0), Square(4.0), Triangle(3.0, 4.0))

    calculateAreas(shapes) // calling the function

}

fun calculateAreas(shapes:Array<Shape>){
    for(shape in shapes){
        println(shape.area())
    }
}

open class Shape{
    open fun area() :Double{
        return 0.0
    }
}

class Circle(val radius:Double) : Shape(){
    override fun area(): Double {
        return Math.PI * radius*radius
    }
}

class Square(val side:Double) :Shape(){
    override fun area(): Double{
        return side*side
    }
}

class Triangle(val base: Double, val height: Double) : Shape(){
    override fun area():Double {
        return 0.5*base*height
    }
}
*/
/*polymorphism helps to write maintanable & extensible code
 * is also helps in interacting with objects via common interface*//*


*/
