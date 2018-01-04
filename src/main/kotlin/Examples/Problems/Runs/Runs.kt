package Examples.Problems.Runs

/*
 * Any array may be viewed as a number of "runs" of equal numbers.
 * For example, the following array has two runs:
 *   1, 1, 1, 2, 2
 * Three 1's in a row form the first run, and two 2's form the second.
 * This array has two runs of length one:
 *   3, 4
 * And this one has five runs:
 *   1, 0, 1, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0
 * Your task is to implement the runs() function so that it returns the number
 * of runs in the given array.
 */

fun runs(a: IntArray): Int {
    // Write your solution here
    var times = 0
    when (a.size) {
        1 -> return 0
        2 -> return if (a[0] == a[1]) 1 else 0
    }

    for ((i, v) in a.withIndex()) {
        if (i <= a.size - 2 && v != a[i + 1]) {
            times++
        }
    }
    return times
}

fun runs_new(a: IntArray): Int {
    // Write your solution here

    if (a.size == 0)
        return 0
    else if(a.size == 1)
        return 1
    else if(a.size == 2){
        if(a[0] == a[1])
            return 2
        else
            return 1
    }
    else{
        var count = 1
        for(i in 0..a.size-2){
            if(a[i] != a[i+1]){
                count = count + 1
            }
        }
        return count
    }

}

fun main(args: Array<String>) {
    println("--1--${runs(intArrayOf(0))}")
    println("--2--${runs(intArrayOf(1, 1))}")
    println("--3--${runs(intArrayOf(3, 1, 2, 3))}")
    println("--4--${runs(intArrayOf(3, 1, 2, 2, 3))}")
    println("--5--${runs(intArrayOf(3, 1, 1, 2, 3))}")
    println("--6--${runs(intArrayOf(1, 1, 1, 1, 1))}")
    println("--7--${runs(intArrayOf(3, 1, 1, 1, 0, 1, 1))}")
    println("--8--${runs(intArrayOf(3, 1, 1, 1, 0, 1))}")
    println("--9--${runs(intArrayOf(5, 1, 0, 1, 0, 1))}")
}