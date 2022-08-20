//Type conversion
    val a: Int = 10
    val b: Long = a
println(b)


//Type checking
    val name: Any = "John"
    if(name is String){
        println(name.length)
    }

//Type Casting
    val name: Any = "John"
    val name1: String = name as String
    println(name1)

//    val x: Int = 7
//    val y: Long = x as Long //error
//
//    val z: Long? = x as? Long
//    println(z)