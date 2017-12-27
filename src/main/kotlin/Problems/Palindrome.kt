package Problems

/*
 * Your task is to implement a palindrome test.
 *
 * A string is called a palindrome when it reads the same way left-to-right
 * and right-to-left.
 *
 * See http://en.wikipedia.org/wiki/Palindrome
 */

fun isPalindrome(s: String): Boolean {
    // Write your solution here
    var flag = true
    for (i in 0 until s.length) {
        print("${s[i]} \n")
        if (s[i] != s[s.length - 1 - i]){
            flag = false
        }
    }
    return flag
}

fun main(args: Array<String>) {
    print(isPalindrome("assa"))
//    isPalindrome("asasfaf")
}

