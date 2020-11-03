fun main (args:Array<String>){
   /* for (item in 1..10){
        println(item)
    }*/
    for (item1 in 1..5){
        println("Item1: $item1")
        for(item2 in 1..7){
            println("Item2: $item2")
        }
        println("Loop Nested Done");
    }
    println("Loop Done")
}