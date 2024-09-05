import java.util.*

fun main() {
    println("Enter purchase amount:")
    var y:Int=readln().toInt();
    var x:Boolean=false
    if(y>=1000){
        if(x){
            println("Congratulation!You are eligible for 20% discount")
        }
        else{
            println("You are eligible for 10% discount")
        }
    }
    else{
        println("No discount")
    }
}