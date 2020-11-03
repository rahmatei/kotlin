fun main (args:Array<String>){
    var map= HashMap<Int,String>()
    map[0] = "Hossein"
    map.put(1,"Ali")
    map.put(33,"Hassan")

    for (itemKey in map.keys)
    {
        println(map.get(itemKey)) // map[itemKey]
    }
}