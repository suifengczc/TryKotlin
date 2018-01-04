package KotlinKoans.Introduction.DefaultArguments

/*
Default arguments
There are several overloads of 'foo()' in Java:

public String foo(String name, int number, boolean toUpperCase) {
    return (toUpperCase ? name.toUpperCase() : name) + number;
}
public String foo(String name, int number) {
    return foo(name, number, false);
}
public String foo(String name, boolean toUpperCase) {
    return foo(name, 42, toUpperCase);
}
public String foo(String name) {
    return foo(name, 42);
}
All these Java overloads can be replaced with one function in Kotlin.
Change the declaration of the function foo in a way that makes the code using foo compile.
Use default and named arguments.
 */

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) =
        (if (toUpperCase) name.toUpperCase() else name) + number

fun useFoo() = listOf(
        foo("a"),
        foo("b", number = 1),
        foo("c", toUpperCase = true),
        foo(name = "d", number = 2, toUpperCase = true)
)

fun main(args: Array<String>) {
    useFoo()
}