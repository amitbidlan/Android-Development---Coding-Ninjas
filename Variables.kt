//Declaration

    val name: String = "John"
    val width: Int = 10

//Type Inference
    val name = "John"
    val width = 10

//Mutability
    val name = "John"
    firstName = "Mark"

//Null Safety
  var name: String = "John"
  println(name.length)  

//Safe call operator ?.
println(name?.length)

//Elvis operator ?:
println(name?.length ?: 0)

    //Not-Null Assertion Operator !!.
    printNameLength("John", "Doe")

    fun printNameLength(firstName: String?, lastName: String?){
        if(firstName != null){
            //Not null assertion operator !!.
            println("Name: ${firstName.length} ${lastName.length}")
        }
    }