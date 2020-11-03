fun main(args:Array<String>) {
    var map = hashMapOf(0 to "Hossein", 1 to "Ali")
    map[2]="Ahmad"
    for (itemkey in map.keys){
        println(map[itemkey])
    }
}