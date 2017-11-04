package Problems07

/*
 * Your task is to implement the indexOfMax() function so that it returns
 * the index of the largest element in the array, or null if the array is empty.
 */

fun indexOfMax(a: IntArray): Int? {
    var max:Int = 0
    var index:Int = 0
    if(a.size == 0){
        return null
    }
    for((k,v) in a() ){
        if (v >= max){
            index = k
        }
    }
    return index
}
