package Kotlin.out.production.Kotlin

fun main() {
    var a:String= readln();
    var b:String=readln();
    var c=a.toInt()
    var d=b.toInt()
//    var arr= arrayOf<String>("1","2","3","4")
//    for((i,e) in arr.withIndex()){
//        println("index $i and value is $e");
//    }
    println(add(c,d))

}
//open class Paper{
//
//}
//class Paper1:Paper(){
//
//}
//fun fact(count:Int=2){
//    var f=1;
//    for(i in 1..count){
//        f*=i;
//    }
//    println(f);
//}
fun add1(a:Int, b:Int):Int{
    var e=a;
    var f=b;
    return e+f;
}
//fun evenOrOdd(a:Int){
//    if(a%2==0){
//        println("Even");
//    }
//    else{
//        println("odd")
//    }
//}