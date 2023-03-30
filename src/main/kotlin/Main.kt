fun main() {
    val evenno = give(listOf("Ken","Wamboi","Phi","Git","copy","Answer","Yes","No","Man","Baby"))
    println(evenno)

    var result = humanHeight(listOf(6.7,34.9,23.9,7.2,3.4))
    println(result)

    val get = listOf(
        Cars("KZZ286F", 300),
        Cars("KBC450D", 600),
        Cars("KDD678G", 1000),
    )
    val average = getAverage(get)
    println("the average mileage is $average")

    var people= humans()
    println(people)
}


fun give(str: List<String>): List<String> {
    val evennumber = mutableListOf<String>()
    for (i in str.indices step 2) {
        evennumber.add(str[i])
    }
    return evennumber
}

/// Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun humanHeight(height:List<Double>):Pair<Double,Double>{
    val x = height.sum()
    val z = height.average()
    return Pair(x,z)

}

///Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class persons(var nam:String,var age:Int,var height:Double,var weight:Int){
    fun detailsList(){
        var persons1 = persons("Chep",59,5.0,70)
        var persons2 = persons("Anita",30,4.2,60)
        var persons3 = persons("Ann",40,5.9,45)

        var personList = listOf(persons1, persons2, persons3)
        var sorted = personList.sortedByDescending { Persons -> Persons.age  }
        println(sorted)
    }

}

//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
fun humans(): List<persons>{
    var persons4 = persons("Faith",59,5.0,70)
    var persons5 = persons("Bridget",30,4.2,60)
    return mutableListOf(persons4, persons5)

}

//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Cars(var registration:String, var mileage:Int)
fun getAverage (avgmileage:List<Cars>): Double{
    var get = 0.0
    for (car in avgmileage){
        get += car.mileage
    }
    return get/ avgmileage.size
}
