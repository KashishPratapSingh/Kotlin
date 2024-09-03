fun main() {
    val result:Double=celToFah(28.45)
    val out:Double=farToCel(89.85)
    if(result!=null){
        println("Temperature in celsius: $result")
    }else{
        println("Temperature is null")
    }
    if(out!=null){
        println("Temperature in faherneit $out")
    }
    else{
        println("Temperature cannot be null")
    }
}
fun celToFah(a:Double):Double{
    val f=(9/5*a)+32
    //println(f)
    return f
}
fun farToCel(b:Double):Double{
    val c=(b-32)*5/9
    //println(c)
    return c
}
