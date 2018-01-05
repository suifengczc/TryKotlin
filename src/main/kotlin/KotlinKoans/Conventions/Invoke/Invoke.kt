package KotlinKoans.Conventions.Invoke

/*
Invoke

Objects with invoke() method can be invoked as a function.

You can add invoke extension for any class, but it's better not to overuse it:

fun Int.invoke() { println(this) }

1() //huh?..

Implement the function Invokable.invoke() so it would count a number of invocations.
 */

/*
当一个类实现了invoke方法时（必须使用operator修饰符）可以不使用方法名实现调用
class test{
    operator fun invoke(n:Int){
        print("n = ${n}")
    }
}
fun useInvoke(){
    val ins = test()
    ins(3)// --> n = 3
    ins.invoke(55)// --> n = 55
    ins(11)(22)(33)/ --> n = 11 n = 22 n = 33

}
 */
class Invokable {
    var numberOfInvocations: Int = 0
        private set

    operator fun invoke(): Invokable {
        numberOfInvocations += 1
        return this
    }
}

fun invokeTwice(invokable: Invokable) = invokable()()