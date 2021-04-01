package chapter06.section02

/**
 * @author sskim
 */
// lateinit을 사용해 지연 초기화하기
// lateinit 사용의 예
class Person {
    lateinit var name: String

    fun test() {
        if(!::name.isInitialized) { // 프로퍼티의 초기화 여부 판단 ::name은 프로퍼티 참조임
            println("not initialized")
        } else {
            println("initialized")
        }
    }
}

fun main() {
    val kildong = Person()
    kildong.test()
    kildong.name = "Kildong" // 이 시점에서 초기화가 된다. (지연초기화)
    kildong.test()
    println("name = ${kildong.name}")
}