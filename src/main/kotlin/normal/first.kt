package normal

//import normal.Color.* //显式地导入枚举类中的值

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

enum class NewColor(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0), ORANGE(255, 265, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIGO(75, 0, 130), VIOLET(238, 130, 238);

    fun rgb() = (r * 255 + g) * 255 + b
}

fun getColor(color: Color) {
    when (color) {
        Color.RED, Color.BLUE, Color.YELLOW -> println(color)
        else -> println("else")
    }
}

fun mixColor(c1: NewColor, c2: NewColor) {
    when (setOf(c1, c2)) {
        setOf(NewColor.RED, NewColor.YELLOW) -> println(NewColor.ORANGE)
        setOf(NewColor.YELLOW, NewColor.BLUE) -> NewColor.GREEN
        setOf(NewColor.BLUE, NewColor.VIOLET) -> NewColor.INDIGO
//        else -> println("no mix")
        else -> throw Exception("can't mix colors")
    }
}

fun test() {
    val numbers = mapOf(0 to "zero", 1 to "one")
    print(numbers.mapValues { it.value.toUpperCase() })
    print(numbers.map { it.value.toUpperCase() })
}

data class person(val name: String, val age: Int) {}

fun String.first(): Char {
    return this[0]
}

fun testGroupBy() {
//    val people = listOf(person("aa", 10), person("ab", 10), person("ac", 11), person("bd", 11), person("ec", 12))
    val people = listOf("ab", "ac", "ad", "e")
//    print(people.groupBy { String::first })
    print(people.groupBy { it.length })
}

class Book(val title: String, val authors: List<String>)

fun testBook() {
//    val books = listOf(Book("Thursday Next", listOf("Jasper Fforde")),
//            Book("Mort", listOf("Terry Pratchett")),
//            Book("Good Omens", listOf("Terry Pratchett",
//                    "Neil Gaiman")))
//    print(books.flatMap { it.authors }.toSet())
//    println(books.map { it.authors })
    val flatten = listOf(listOf("a", "b", "c"), listOf("d", "e", "f"), listOf("g", "h", "i", listOf("j", "k", "l", "m", "n")))
    println(flatten.flatten())

}

fun testSequence() {
    val naturalNumbers = generateSequence(0) { it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    print(numbersTo100.sum())
}

fun main(args: Array<String>) {
//    getColor(Color.YELLOW)
//    try {
//        mixColor(NewColor.YELLOW, NewColor.VIOLET)
//    }catch (e:Exception){
//        print(e.message)
//    }
//    for (i in 100 downTo 1 step 2) {
//        println(i)
//    }
//    print("kotlin" in "java".."scala")
//    val list = listOf("args:", *args)
//    println(list)
    testSequence()
}

