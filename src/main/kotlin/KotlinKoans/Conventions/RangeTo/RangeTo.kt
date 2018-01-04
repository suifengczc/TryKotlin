package KotlinKoans.Conventions.RangeTo

import KotlinKoans.Conventions.Comparison.MyDate

/*
Range to
Implement the function MyDate.rangeTo(). This allows you to create a range of dates using the following syntax:

MyDate(2015, 5, 11)..MyDate(2015, 5, 12)
Note that now the class DateRange implements the standard ClosedRange interface and inherits contains method implementation.
 */

operator fun MyDate.rangeTo(other: MyDate) = DateRangee(this, other)

class DateRangee(override val start: MyDate, override val endInclusive: MyDate): ClosedRange<MyDate>

fun checkInRangee(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}