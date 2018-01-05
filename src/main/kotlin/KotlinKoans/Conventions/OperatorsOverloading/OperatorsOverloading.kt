package KotlinKoans.Conventions.OperatorsOverloading

/*
Operators overloading

Implement a kind of date arithmetic.
Support adding years, weeks and days to a date.
You could be able to write the code like this: date + YEAR * 2 + WEEK * 3 + DAY * 15.
At first, add an extension function 'plus()' to MyDate, taking a TimeInterval as an argument.
Use an utility function MyDate.addTimeIntervals() declared in DateUtil.kt
Then, try to support adding several time intervals to a date. You may need an extra class.
*/

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

//为TimeInterval添加两个重载方法，传入参数分别为TimeInterval和RepeatedTimeInterval类型
operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval, 1)
operator fun MyDate.plus(timeIntervals: RepeatedTimeInterval) = addTimeIntervals(timeIntervals.timeInterval, timeIntervals.number)

fun task1(today: MyDate): MyDate {
    return today + TimeInterval.YEAR + TimeInterval.WEEK
}

class RepeatedTimeInterval(val timeInterval: TimeInterval, val number: Int)

//为TimeInterval实现tiems(*)方法，返回RepeatedTimeInterval类型
operator fun TimeInterval.times(number: Int) = RepeatedTimeInterval(this, number)

fun task2(today: MyDate): MyDate {
    return today + TimeInterval.YEAR * 2 + TimeInterval.WEEK * 3 + TimeInterval.DAY * 5
//    return MyDate(1,2,3)
}