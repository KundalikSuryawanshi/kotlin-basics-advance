package AdvanceKotlin


//kotlin notes
/* //ABSTRCT CLASSES
 *
 * abstrct classse cant be instantiated
 * abstrct class can have both abstrct and non abstrct properties and methods
 * if class has abstract method or property then class must be declared as abstract
 * all the abstract classes are bydefault open
 * abstract method should be in abstract class
 * if you make class abstract then no one can inherited from this class and not able to create objectof  that class
 *abstract function do not have body
 when we have to create abstract method and class in parent class then we have to inherit it in our child class

*/

/*
fun AdvanceKotlin.main(){
    val circle = Circle(4.0)
    println(circle.area())
    circle.display()

}

abstract class A{
    fun method1(){
        println("i am in method1")
    }
}

abstract class Shape{
    val name : String = ""
    abstract fun area():Double
    abstract fun display()
}

class Circle(val radius:Double):Shape(){
    override fun area() : Double = Math.PI*radius*radius
    override fun display(){
        println("circle is getting display")
    }
}
*/



/*
 * gruop objects based on what they can do rather than what they are
 * to use polymorphism in unrelated set of classes (ie classes which do not belog to same inheritance hierarchy)
 * common terminilogy - interface is a contract which states that whoever implements that interface has to provide the  implementation for  the mthod
 *
 * interface are meant for behavioours, classes which exhibits that behaviour implements that interface
 * interface can have both abstract and concreate methods
 * interface can implement othe interfaces
 * one class can inmplement many interface but classes can have only one supperclass
 *
*/
/*
fun AdvanceKotlin.main(){
    dragObjects(arrayOf(Circle(4.0), Square(4.0),
        Trianle(2.0, 3.0), Player("kundalik")))

}

fun dragObjects(objects: Array<Draggable>){
    for(obj in objects){
        obj.drag()
    }

}

interface Draggable{
    fun drag()
}*/

// interface Cloneable{
//     fun clone()
// }

// abstract class Shape : Draggable , Cloneable{
//     abstract fun area():Double
//     abstract fun drag()
// }

/*

abstract class Shape : Draggable{
    abstract fun area():Double


}

class Circle(val radius:Double):Shape(){
    override fun area():Double = Math.PI*radius*radius
    override fun drag() = println("circle is dragging")
}

class Square(val side:Double): Shape(){
    override fun area():Double = side*side
    override fun drag() = println("square is dragging")
}

class Trianle(val base : Double, val height : Double) : Shape(){
    override fun area():Double = 0.5 * base * height
    override fun drag() = println("triangle is dragging")
}

class Player(val name :String):Draggable{
    override fun drag() = println("$name is dragging")
}
*/


//TYPE CHECKING AND SMART CASTING
//type checking is used to check object belong from which class,
//to indentify the type of object
//by using "is" operator
// fun AdvanceKotlin.main(){
//     val circle = Circle(0.4)
//     val player = Player("gaurav")

//     if(circle is Circle){
//         println("this is circle")
//     }
// }

////SMART CASTING
////Smart cast is a feature in which Kotlin compiler tracks conditions inside if expression.
//fun AdvanceKotlin.main(){
//
//    val circle = Circle(0.4)
//    val player = Player("gaurav")
//
//
//    val arr:Array<Draggable> = arrayOf(circle,player)
//    for (obj in arr){
//        if(obj is Circle){
//            println(obj.area())
//        }
//        else{
//            (obj as Player).toString()
//        }
//    }
//}
//
//
//
//interface Draggable{
//    fun drag()
//}
//
//
//
//abstract class Shape : Draggable{
//    abstract fun area():Double
//
//
//}
//
//class Circle(val radius:Double):Shape(){
//    override fun area():Double = Math.PI*radius*radius
//    override fun drag() = println("circle is dragging")
//}
//
//class Square(val side:Double): Shape(){
//    override fun area():Double = side*side
//    override fun drag() = println("square is dragging")
//}
//
//class Trianle(val base : Double, val height : Double) : Shape(){
//    override fun area():Double = 0.5 * base * height
//    override fun drag() = println("triangle is dragging")
//}
//
//class Player(val name :String):Draggable{
//    override fun drag() = println("$name is dragging")
//}

//VISIBILITY MODIFIRES Encapsulation
//
//modifire			top level declaration			class member
//public			Everywhere						Everywhere
//internal 			with the module					with the module
//private			with in file 					with in class
//protected 		N/A								subclasses


//OBJECT DECLARATION
//object declaration-
//class and its single object is created at once
//no constructor are allowed (init block is allowed)
//singleton pattern
//you can inherit class / interface
//
//singlton pattern - class which allow to create only one object

/*

fun AdvanceKotlin.main(){
    SharingWidget.incrementTwiterLikes()
    SharingWidget.incrementTwiterLikes()
    SharingWidget.incrementTwiterLikes()

    SharingWidget.incrementFbLikes()
    SharingWidget.display()


}

object SharingWidget{
    private var twiterLikes = 0
    private var fbLikes = 0

    fun incrementTwiterLikes() = twiterLikes++
    fun incrementFbLikes() = fbLikes++
    fun display() = println("Facebook -$fbLikes -- Twitter -$twiterLikes")
}
*/


//OBJECT EXPRESSION
//anonymous objects using object keyword
//replacement of java anonymous inner class

// 	ANONYMOUS OBJECT
//COMPANION OBJECTS
//one class have only one companion object
//@jvmStatic is use to work like a static in java code
/*fun AdvanceKotlin.main(){
    MyClass.MyObject.f()
    MyClass.f()
    MyClass.AnotherObject.g()
}

class MyClass{
    companion object MyObject {
        @jvmStatic
        fun f(){
            println("hello i am f from object")
        }
    }

    object AnotherObject{
        fun g(){
            println("hello i am g from another object")
        }
    }
}*/

//factory pattern - one of the method in which we can pass parameter and it will return object
//
//DATACLASSES
//
/*

fun AdvanceKotlin.main(){
    val os1 = OS(1,"iOS")
    val os2 = OS(2,"Android")


    println(os1) //toString
    println(os2)
    println(os1.hashCode())
    println(os1 == os2) //os1.equals(os2)

    val os3 = os1.copy(Id=3)
    println(os3)

    val (id,name)=os1
    println(id)
    println(name)
    println(os1.component1())

}

data class OS(val Id:Int , val Name:String)
*/
/*
fun AdvanceKotlin.main(){
    var gender:String = "male"//"female" , "others"
    var gender2: String? = null
    var isAdult : Boolean? = true

    if(gender2 != null){
        println(gender2.toUpperCase())
    }

    println(gender2?.toUpperCase())

    gender2?.let{
        println("Line 1")
        println("line2 $gender2")
        println("Line 3 $it")
    }
    gender.let{ }
}*/

/*Exeption is a base class of all exceptions
 * write it at the end of all catch blocks
 * follow the sequence of exception in catch block
*try always comes with catch or finaly
*first specific after generic
 * */
/*
fun AdvanceKotlin.main(){
    val arr = arrayOf(1,2,3)
    try{
        println(arr[5])
    }
    catch(e: NullPointerException){

    }
    catch(ex:Exception){
        println("Please check the array index")
    }
    finally{
        println("I will execute no matter what")
    }
}
*/

//user defind exception
/*
fun AdvanceKotlin.main(){
    createUserList(5)
    createUserList(-2)
}

fun createUserList(count: Int){
    if(count<0){
        //Exception raise
        throw IllegalArgumentException("count must be greater than 0")
    }
    else{
        println("User list created containing $count users")
    }
}*/


