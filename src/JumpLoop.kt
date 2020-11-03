fun main (args:Array<String>){
    loop@ for (item1 in 1..10){
        for (item2 in 1..5){
            if(item2==3){
                break@loop
                //continue
                //break
            }
            println("Item2:$item2")
        }
    }
}