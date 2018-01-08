package ForJunit

class ForJunit{
    fun sayHello (s:String):String{
        return "say hello:$s"
    }

}

fun main(args: Array<String>) {
    val a = ForJunit()
    print(a.sayHello("tt"))
}