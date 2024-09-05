fun main() {
    var iAmount:Int=1000
    while(true){
        println("You want to make withdraw?(yes/no): ")
        var i:String=readln();
        if(i=="yes") {
            var eAmount:Int=readln().toInt()
            if(eAmount<1000){
                println("Insufficient Amount")
            }
            else{
                println("Amount has been deducted")
            }
        }
        else if(i=="no"){
            break;
        }
    }
}