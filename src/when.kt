fun main(args:Array<String>){
    print("Please Input Number Grade:")
    var x= readLine()!!.toInt()
    when(x){
         in 1..10 -> {
          println("Bad Number : $x")
        }
        in 1..19 ->{
            println("Good Number : $x")
        }
        20 ->{
            println("Prfect Number : $x")
        }
        else->{
            println("Number Out Of Range 1..20")
        }
    }
}