package Examples.DelegatedProperties.ObservableProperty

import kotlin.properties.Delegates

//TODO 这里的observable转换成非lambda写法
class User {
    var name: String by Delegates.observable("nomalName") { prop, old, new ->
        println("$old -> $new")
    }
}

fun main(args: Array<String>) {
    val u = User()
    u.name = "first"
    u.name = "second"

}