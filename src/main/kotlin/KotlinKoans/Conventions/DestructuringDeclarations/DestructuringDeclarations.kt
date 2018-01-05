package KotlinKoans.Conventions.DestructuringDeclarations

/*
Destructuring declarations

Read about destructuring declarations and make the following code compile by adding one word.
 */

//class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)
data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) //只有data class 类型才能使用该特性

fun isLeapDay(date: MyDate): Boolean {

    val (year, month, dayOfMonth) = date

    // 29 February of a leap year
    return year % 4 == 0 && month == 2 && dayOfMonth == 29
}