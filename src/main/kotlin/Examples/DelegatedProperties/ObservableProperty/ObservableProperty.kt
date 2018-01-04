package Examples.DelegatedProperties.ObservableProperty

import kotlin.properties.Delegates

//TODO 这里的observable转换成非lambda写法
class mUser {
    var name: String by Delegates.observable("nomalName") { prop, old, new ->
        println("$old -> $new")
    }
}

fun main(args: Array<String>) {
    val u = mUser()
    u.name = "first"
    u.name = "second"

}