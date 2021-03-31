package chapter03.section05.localreturn

/**
 * @author sskim
 */
// return 으로 람다식 빠져나오기
fun main() {
    shortFunc(3) {
        println("First call: $it")
        return
    }
}

inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}