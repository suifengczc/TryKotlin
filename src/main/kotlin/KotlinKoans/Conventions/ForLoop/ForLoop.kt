package KotlinKoans.Conventions.ForLoop

/*
For loop
Kotlin for loop iterates through anything that provides an iterator.
Make the class DateRange implement Iterable<MyDate>, so that it could be iterated over.
You can use the function MyDate.nextDay() defined in DateUtil.kt
 */

class DateRange(val start: MyDate, val end: MyDate){
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
//    for (date in firstDate..secondDate) {
//        handler(date)
//    }
}