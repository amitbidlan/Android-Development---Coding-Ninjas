//if/else
    var discount = 0
    val price = 85
    if(price > 50){
        discount = 10
    } else{
        discount = 3
    }
    println(discount)

//    discount = if(price > 50)  10 else  3
//    println(discount)

//when
    val rating = 4
    val result = when(rating) {
        5 -> "High"
        3,4 -> "Good"
        1,2 -> "Poor"
        else ->{
            println("No Rating")
            "Zero"
        }
    }
    println("The rating is $result")
