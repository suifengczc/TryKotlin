package Examples.Problems.IndexOfMax

/*
 * Your task is to implement the indexOfMax() function so that it returns
 * the index of the largest element in the array, or null if the array is empty.
 */

fun indexOfMax(a: IntArray): Int? {
    var max = 0
    var index = 0
    if(a.size == 0){
        return null
    }
    for((k,v) in a.withIndex() ){
        if (v - max > 0){
            index = k
            max = v
        }
    }
    return index
}
