fun main (args:Array<String>){
    var itemList = ArrayList<String>()
    itemList.add("Ali")
    itemList.add("Mohammad")
    itemList.set(0,"Hoosein")   // itemList[0]="Hossein"

    println("itemList[0]="+itemList.get(0))   //itemList[0]

    for (item in itemList)
    {
        println(item)
    }
}