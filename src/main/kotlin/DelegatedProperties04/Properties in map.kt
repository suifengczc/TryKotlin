package DelegatedProperties04

private class User(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int     by map
}

fun main(args: Array<String>) {
    val user = User(mapOf(
            "name" to "zhangsan",
            "age" to 25
    ))

    println("name = ${user.name}, age = ${user.age}")
}