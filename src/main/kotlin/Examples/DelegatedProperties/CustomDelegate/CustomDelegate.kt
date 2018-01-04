package Examples.DelegatedProperties.CustomDelegate

import kotlin.reflect.KProperty

class Delegate(){
//    operator fun getValue(thisRef: Any?, prop: KProperty<*>):String {
//        return "$thisRef,think you for delegating '${prop.name}' for me"
//    }

//    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {
//        println("$value has been assigned to ${prop.name} in $thisRef")
//    }

    /**
     * 代理类提供getValue()函数，参数要求：
     * 接收者（receiver）：第一个参数，必须是属性对应的类或父类型。
     * 元数据（metadata）：第二个参数，必须是“KProperty<*>”或它的父类型。
     * 该函数，必须返回一个跟属性同类型的值。
     */
    operator fun getValue(thisRef: Example, prop: KProperty<*>):String {
        return "$thisRef,think you for delegating '${prop.name}' for me"
    }

    /**
     * 接收者（receiver）：第一个参数，必须是属性对应的类或父类型。
     * 元数据（metadata）：第二个参数，必须是“KProperty<*>”或它的父类型。
     * 新值：第三个参数，类型必须跟属性一样或其父类型。
     */
    operator fun setValue(thisRef: Example, prop: KProperty<*>, value: String) {
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}

class Example{
    /*by表示p变量由delegate类代理，p的get(),set()方法对应代理的getValue()和setValue()
    当p被val修饰时，表示该变量为只读属性，Delegate只需要提供getValue方法即可
    当p被bar修饰时，Delegate除了需要提供与只读属性相同的getvalue方法之外还需要提供serValue方法
    */
    var p:String by Delegate()
    override fun toString(): String {
        return "Example Class"
    }
}

fun main(args: Array<String>) {
    val e = Example()
    println(e.p)
    e.p = "new"
}