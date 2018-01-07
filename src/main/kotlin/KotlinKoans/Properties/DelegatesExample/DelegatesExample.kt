package KotlinKoans.Properties.DelegatesExample

/*
Delegates example
Read about delegated properties and make the property lazy by using delegates.
 */

class LazyProperty(val initializer: () -> Int) {
    val lazyValue: Int by lazy(initializer)
}