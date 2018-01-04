package Examples.DelegatedProperties.LazyProperty

/**
 * 标准代理（Standard Delegates）
 * Kotlin的标准库，通过工厂方法提供了一些有用的代理类。
 * lazy()函数接受Lambda表达式 并 返回“Lazy<T>”实例，
 * 它可以当做延迟属性的代理实现：当第一次属性执行get()（获取属性值，即使用该属性）时，
 * 会通过“lazy()”函数执行添加的Lambda表达式并记录返回值；后续再使用该属性时，直接使用记录的值。
 *
 * 默认情况，延迟属性的赋值是线程同步的：只会在一个线程中计算一次值，其他线程使用同一个值。
 * 如果初始化同步不是必须的，可以通过将“lazy()”函数的参数设置为“LazyThreadSafetyMode.PUBLICATION”，
 * 那么多个线程对其同时赋值。如果可以确保属性只会在单个线程中初始化，可以将“lazy()”设置“LazyThreadSafetyMode.NONE”模式，
 * 该模式下，不会确保线程安全及相关开销。
 */
class LazySample {
    val lazyStr: String by lazy {
        println("hello lazy")
        "my lazy"
    }
}

fun main(args: Array<String>) {
    val sample = LazySample()
    println("lazy = ${sample.lazyStr}")
//    println("lazy = ${sample.lazyStr}")

}