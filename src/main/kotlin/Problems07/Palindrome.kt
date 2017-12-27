package Problems07

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
    for (i in 0 until s.length) {
        if (s[i] != s[s.length - i - 1]) {
            return false
        }
    }
    return true
}

fun main(args: Array<String>) {
    print(isPalindrome("asasfaf"))
}

