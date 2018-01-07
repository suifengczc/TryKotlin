package KotlinKoans.Properties.Properties

/*
Properties

Read about properties in Kotlin.

Add a custom setter to PropertyExample.propertyWithCounter so that
the counter property is incremented every time propertyWithCounter is assigned to.
 */

class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        set(value) {//set方法的传参一般使用value，
            counter++
            field = value//当需要给当前变量赋值时使用field关键字，field 标识符只允许在属性的访问器函数内使用
        }
}