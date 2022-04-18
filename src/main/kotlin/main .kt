fun main() {
    var y =girl("anna", 5)
    y.eat("nyama choma")
    y.dressCode("blue","yellow")
    y.teacher("amina")

    var x= boy("tim", 6)
    x.play()
    x.teacher("aloson")
    x.eat("food")
    x.dressCode("cream","long")


    them()
    stud(arrayOf("fardosa is fire"))
    even()

}
open class Student(name:String, age:Int){
   open fun dressCode(skirt:String, top:String){
        println("i want a $skirt skirt and a $top top")

    }
    fun play(game:String, time:Int){
        println("we play $game within $time minutes")
    }
    fun eat(meal:String){
        println("we have speacial $meal today ")

    }
    fun teacher(name:String){
        println("the teacher for IOT is mr $name ")
    }

}
class girl(name: String, age:Int):Student(name, age){
    fun eat(){
        println(" i love eating")
    }

}
class boy(name: String, age: Int):Student(name, age){
    fun play(){
        println("i love football")
    }

    override fun dressCode(skirt: String, top: String) {
//        super.dressCode(skirt, top)
        println("i want a trausers not skirts")
    }

    }
fun them(){
    var  names= arrayListOf("anna", "jay", "kim", "silas","ali")
    for (name in names){
        println(name)
    }

}
fun stud(nam:Array<String>){
    for (name in nam){
        println(name)
    }

}
fun even(){
    for (num in 1..100){
        if (num %2 !=0){
            println(num)
        }
    }
}
data class Car(var make:String, var model:String){
   var car= listOf(
       Car("hhh", "errr")


   )


}















