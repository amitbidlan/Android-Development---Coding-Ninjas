//For loop
    val names = arrayOf("jack", "john", "frank")

    for(name in names){
        println(name)
    }

    for(i in names.indices){
        println(names[i])
    }

//Range
    println("Line 1:")
    for (i in 1..5){
        print(i)
    }
    println("\nLine 2:")
    if(4 !in 5..10){
        print("Not there")
    }
    println("\nLine 3:")
    for (i in 1 until 5) {
        print(i)
    }
    println("\nLine 4:")
    for (i in 1..5 step 2){
        print(i)
    }
    println("\nLine 5:")
    for (i in 5 downTo 1) {
        print(i)
    }
//while
    var i = 0
    while (i < 5) {
        println("Hello, World!")
        i++
    }
    
    var name: String?
    do {
        name = "John"
        println(name)
    } while (name == null)
    