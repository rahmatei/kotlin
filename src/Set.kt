fun main (args:Array<String>){

    println("Set")
    var set= setOf(15,20,15,10,5)
    for (item in set){
        println(item)
    }
    //set[0]=55 Not change


    println("MutableSet")
    var mutableSet= mutableSetOf(10,15,20,25)
    mutableSet.add(30)
    for (item in mutableSet){
        println(item)
    }
}