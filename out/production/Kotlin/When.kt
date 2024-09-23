package Kotlin.out.production.Kotlin

fun main() {
    val f=add(234,345)
    println(f);
//    var i: String =readln();
//    var c=i.toInt()
//    when(c){
//        1->"Monday";
//        2->"Tuesday"
//        3->"Wednesday"
//        4->"Thrusday"
//        5->"Friday"
//        6->"Saturday"
//        7->"Sunday"
//        else->" "
//    }
//    var c=4
//    val b= c in 1 until 5
//    println(b);
//    if(c%2!=0){
//        println("True");
//    }
//    else{
//        println("False");
//    }
//    Loops-->
//    var i=1;
//    do{
//        println(i);
//        i++;
//    }while(i<=10)
//    for( i in 1 ..10){
//        println(i);
//    }
//    for(i in 1 until 3){ -- in until we don't reach till last value-->
//        println(i)
//    }
//    for(i in 5 downTo 0){
//        println(i)
//    }
//    for(i in 1 .. 5 step 2){
//        println(i)
//    }
}
fun add(a:Int, d:Int):Int{
    return a+d;
}