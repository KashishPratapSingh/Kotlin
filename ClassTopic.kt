class Person{
    var name:String
    var age:Int
    constructor(x:String,y:Int){
        this.name=x
        this.age=y
    }
    constructor(x:String){
        this.name=x
        this.age=20
    }
    constructor(){
        this.name="Rahul"
        this.age=32
    }
    fun intro(){
        println("my name is $name and age is $age")
    }
}
fun main() {
    var a=Person("Shashank",22) 
    a.intro()
    var b=Person()
    b.intro()
    var c=Person("Kashish Pratap Singh")
    c.intro()
}
// Primary constructor use:-
//class Person(var name:String, var age:Int){
//    constructor(x:String):this(){
//        this.name=x
//        this.age=0
//    }
//    constructor():this("Rahul",50)
//    fun intro(){
//        println("My name is $name and age is $age")
//    }
//}
//fun main() {
//    var a=Person("Shashank",22)
//    a.intro()
//    var b=Person()
//    b.intro()
//    var c=Person("Kashish Pratap Singh")
//    c.intro()
//}
