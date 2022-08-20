fun main() {
//declaration
    println(addNumbers(4, 5))
    printUserName("John")
}

fun addNumbers(x: Int, y: Int): Int {
    return x + y
}

fun printUserName(name: String): Unit{
    println(name)
}


//Default arguments
    printUserName("John", "Frost")
    printUserName("John")

fun printUserName(firstName: String, lastName : String = "Doe"){
    println("The name is: $firstName $lastName")
}


//Named Argument
    println(volume("Record Box",1, height=10, width=5))

fun volume(boxName: String, length: Int, width: Int, height: Int): Int{
    println(boxName)
    return length * width * height
}

//Single expression function
	addNumbers(3,7)
  

fun addNumbers1(x: Int, y: Int): Int {
      return x + y
  }

//  fun addNumbers(x: Int, y: Int) = x + y

