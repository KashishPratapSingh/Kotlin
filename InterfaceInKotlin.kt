interface Shape{
    fun area():Double
}
open class Rectangle(val a:Double, val b:Double):Shape{
    override fun area(): Double {
        return a*b
    }
    open fun display(){
        println("Area of rectangle with dimensions $a * $b is ${area()}")
    }
}
class Square(side:Double):Rectangle(side,side){
    override fun display() {
        println("area of square with side $a is ${area()}")
    }
}

fun main() {
    val myRectnagle=Rectangle(4.0,5.0)
    myRectnagle.display()
    val mySqaure=Square(3.0)
    mySqaure.display();
}