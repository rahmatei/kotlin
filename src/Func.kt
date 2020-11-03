fun sum (val1:Double,val2:Double):Double{
    return val1+val2
}
fun Display(v:Int=15):Unit{
    println("V = $v")
}
fun main (args:Array<String>){
    print("Please Input Value 1:")
    var v1= readLine()!!.toDouble();
    print("Please Input Value 2:")
    var v2= readLine()!!.toDouble();

    println("Sum $v1 And $v2 Equal => " + sum(v1,v2))

    Display(20)

}


// Function have a OverLoad And Override=> Polymorphism