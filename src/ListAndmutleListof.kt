fun main (args:Array<String>){
    var ls= listOf(1,10,15,20)
    println("List")
    for (item in ls){
        println(item)
    }

    //ls[0]=15  --> Error Link List Not Change

    var mutablels= mutableListOf(15,20,25,30)

    println("mutablels List")
    for(item in mutablels){
        println(item)
    }

    mutablels[0]=10

    println("Change mutablels List")

    for (item in mutablels)
    {
        println(item)
    }

}