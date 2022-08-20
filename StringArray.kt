//String Concatenation    
    val name: String = "John" + " Doe"
    println(name)

    val address: String = "House no. " + 23
    println(address)

//     val address1: String = 23 + ", Block C"
//     println(address1)

//String Template

    val flatNumber: Int = 25
    val address: String = "Tower 2, Flat No. " + flatNumber
    println(address)

//    val flatNumber1: Int = 23
//    val address1: String = "Tower 2, Flat No. $flatNumber1"
//    println(address1)
//    
//    val name: String = "John Doe"
//    println("name is ${name.length} characters long")

//Array
    val numbers = arrayOf(1,2,3,4)

    println("The number at second position: ${numbers.get(1)}")
    println("The number at third position: ${numbers[2]}")
    numbers.set(3, 5)
    numbers[1] = 22
    println(numbers.joinToString(","))

//     val numbersZero = Array(4){0}
//     println(numbersZero.joinToString(","))
