fun main (args:Array<String>){
    var arr=Array<Int>(5){0}
    arr[3]=3
    println("Arr[3]="+arr[3])


    for (item in arr){
        println(item)
    }


    for (index in arr.indices){    // indices =>  in 0..arr.size()-1
        println("arr index:$index And Value=" + arr[index])
    }

    var arrStr = Array<String>(4){""}
    for (indexStr in arrStr.indices){
        print("Please Input Value arrStr[$indexStr]")
        arrStr[indexStr]= readLine()!!;
    }
    for (index in arrStr.indices){
        println("arr index:$index And Value=" + arrStr[index])
    }
}