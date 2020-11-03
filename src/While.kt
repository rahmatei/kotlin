
fun main(args:Array<String>){
    println("Please Input Number:")
    var number= readLine()!!.toInt()
    while (number!=0){
        println("Number : $number")
        println("Please Input Number:")
        number=readLine()!!.toInt()
    }
}