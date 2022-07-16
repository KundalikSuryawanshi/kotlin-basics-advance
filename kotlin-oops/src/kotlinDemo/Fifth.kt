package AdvanceKotlin


/*LIST-
 * mutable list - can be changed ie. element can be added removed replace
 * immutable list - can't be changed
 * by default list is immutable we have to specify it mutable so we can chnage it
 * */
/*
fun AdvanceKotlin.main(){
    //val nums = listOf(1,2,3) //immutable list we can't change or modify it
    val nums = mutableListOf(1,2,3)
    println(nums.indexOf(3))
    println(nums.contains(4)) //it will return boolean value if element present ot not

    nums[1] = 2
    nums.add(5)
    nums.remove(1)

    println(nums)

    //to merge one list in another list
    val list2 = listOf(11,12)
    nums.addAll(list2)
    println(nums)
}
*/

//MAPS - it store the data in the form of key value pair
/*
fun AdvanceKotlin.main(){
    val students = mutableMapOf<Int, String>()
    students.put(1, "spriten")
    students.put(2,"katherin")
    students.put(3,"stewart")

    println(students.get(1))
    println(students.get(11))

    println("--------------------------------------")

    for((key, value) in students){
        println("$key = $value")
    }

    println("--------------------------------------")

    //we can also add element by this method
    students[8] = "adam"
    println(students[8])

    println("--------------------------------------")
    //we can also add element by this method
    val map = mapOf(1 to "Katherin" , 2 to "Longford")
    println(map)

}
*/

//LAMBDA  functions
//in kotlin we called first class citizen to the function 
//we can assign function in varible we also write function which have return type fucntion
//
/*

fun AdvanceKotlin.main(){
    println(sum(2.0, 3.0))
    println(power(3.0, 2.0))

    //lamnda expression

    var fn: (a: Double, b: Double) -> Double = ::sum
    println(fn(2.0, 4.0))

//     var fn2 : (a:Double, b:Double) -> Double = ::power
//     println(power(2.0,3.0))
}
fun sum(a: Double, b:Double) : Double {
    return a+b
}
fun power(a:Double, b:Double) :Double {
    return a // return a.pow(b)
}
*/

//LAMBDA - 
//in multiline lamda last line of code will be the return type of that function

// fun AdvanceKotlin.main(){
//     val lambda1 = {x: Int , y: Int -> x + y}

//     val multiLineLambda = {
//         println("Hello Lambda")
//         val a:Int = 2+3
//         "hello gaurav"
//     }
//     println(multiLineLambda())
// }

//single parameter
// fun AdvanceKotlin.main(){
//     val singleParam:(Int) -> Int = {x -> x + x}
//     val simplyFySingleParam:(Int) -> Int = {it + it}
//     //it represent single variable of that lambda

// }

//if lambda function is last argument of our other function then
// write it after the function parenthesis
// fun AdvanceKotlin.main(){
//     calculator(1,2){a,b -> a+b}
//     //calculator(1,2, {a,b-> a+b})
// }

// fun sum(a:Int, b:Int):Int = a+b

// fun calculator(a:Int, b:Int, op:(Int,Int)->Int):Int {
//     return op(a,b)
// }

//COLLECTION FUNCTION - .ForEach(), .Map(), .Filter()
/*
fun main(){

    val nums = listOf(1,2,3,4,5)
    val list = nums.filter {it % 2 != 0}

    val userList = listOf(
        User(1,"A"),
        User(2,"D"),
        User(3,"C")
    )

    println(userList.filter{it.id == 2})

    println(list)
}

data class User(val id:Int, val name:String)
*/

//MAP - Kotlin map is a collection which contains pairs of objects.
// //Map holds the data in the form of pairs which consists of a key and a value.
// //Map keys are unique and the map holds only one value for each key
// // If multiple pair have same key then map will return the last pair value.
// fun main(){
//     val nums = listOf(1,2,3,4,5)

//     val userList = listOf(
//         User(1,"A"),
//         User(2,"D"),
//         User(3,"C")
//     )
//     val list = nums.map{it*it}

//     val paidUserList = userList.map{
//         PaidUser(it.id, it.name, "paid")
//     }

//     println(paidUserList)
// }


// data class User(val id:Int, val name:String)
// data class PaidUser(val id: Int, val name: String, val type: String)

//FOR EACH -
//fun main(){
//    val nums = listOf(1,2,3,4,5)
//
//    nums.forEach{println(it)}
//}