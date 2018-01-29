package ForJunit

class ForJunit {
    fun sayHello(s: String): String {
        return "say hello:$s"
    }

    fun transferNum(num: Long): String {
        val realNum = Math.abs(num)
        return when {
            realNum > 100000000 -> "${(num / 100000000) % 2f}亿"
            realNum > 10000 -> "${(num / 10000) % 2f}万"
            else -> num.toString()
        }
    }
}

fun main(args: Array<String>) {
    val a = ForJunit()
    print(a.sayHello("tt"))
}