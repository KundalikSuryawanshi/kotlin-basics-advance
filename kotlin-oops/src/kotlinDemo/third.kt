package AdvanceKotlin//Abstract classes
/*abstraction is used to data hiding for security reason
* it used to provide common template to extend them
* abstract methods and variable work as normal unless it marked abstract*/
/*abstract class Human(){
    //if any class inherit from Human then will need to initialize and use
    abstract var firstName: String
    abstract var lastName: String
    abstract fun printDetails()

    fun fullName(): String{
        return "Full name:$firstName $lastName"
    }
}

class Employee(override var firstName: String, override var lastName: String) : Human() {

    override fun printDetails() {
        println("Employee Details:")
        println("-----------------")
        println("First name:$firstName")
        println("Last name:$lastName")
        println(fullName())
        println("\n\n")
    }
}

class Student(override var firstName: String,override var lastName: String) : Human() {

    override fun printDetails() {
        println("Student Details:")
        println("-----------------")
        println("First name:$firstName")
        println("Last name:$lastName")
        println(fullName())
        println("\n\n")
    }
}

fun AdvanceKotlin.main(){
    val gaurav = Student("Gaurav","Suryawanshi")
    gaurav.printDetails()

    val kundalik = Employee("kundalik","Suryawanshi")
    kundalik.printDetails()
}*/

/*
//interfaces
*/
/*interface don't have constructor so at the inheriting time we don't bracket
* *//*

interface HumanActions{
    fun eat(){
        println("I'm Human and I'm Eating")
    }

    fun walk()
}

interface EmployeeAction{
    fun work()

    fun takeVacation()
}

abstract class Human(){
    abstract var firstName: String
    abstract var lastName: String
    abstract fun printDetails()

    fun fullName(): String{
        return "Full name:$firstName $lastName"
    }
}
class Student(override var firstName: String,override var lastName: String):
    Human(),HumanActions,EmployeeAction{
//here employee class inherit human class as well as HumanAction & EmployeeAction interface
    //interface do not have a constructor then we will no need to put bracket
    override fun printDetails() {
        println("Student Details:")
        println("-----------------")
        println("First name:$firstName")
        println("Last name:$lastName")
        println(fullName())
        println("\n\n")
    }

    override fun eat() {
        println("I'm eating but from the Employee class, not HumanAction")
    }

    override fun walk() {

    }

    override fun work() {

    }

    override fun takeVacation() {

    }
}

class Employee(override var firstName: String, override var lastName: String): Human() {

    override fun printDetails() {
        println("Student Details:")
        println("-----------------")
        println("First name:$firstName")
        println("Last name:$lastName")
        println(fullName())
        println("\n\n")
    }
}
fun AdvanceKotlin.main(){
    val kundalik = Student("Kundalik","Suryawanshi")
    kundalik.printDetails()
    kundalik.eat()
}*/
