package chapter03.section05.noinline

/**
 * @author sskim
 */
// noinline으로 람다식의 인라인 막기
fun main() {
    shortFunc(3) { println("First call: $it") }
}

inline fun shortFunc(a: Int, noinline out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}