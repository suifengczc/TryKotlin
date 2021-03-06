package KotlinKoans.Properties.LazyProperty

/*
Lazy property
Add a custom getter to make the 'lazy' val really lazy.
It should be initialized by the invocation of 'initializer()' at the moment of the first access.

You can add as many additional properties as you need.

Do not use delegated properties!
 */

class LazyProperty(val initializer: () -> Int) {

    //    private val lazyValue: Int? = null
//        get() {
//            if (field == null) {
//                field = initializer()
//            }
//                return field
//        }
    private val lazyValue: Int? = null
        get() = field ?: initializer()

    val lazy: Int
        get() {
            return lazyValue!!
        }
}