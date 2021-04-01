package chapter05.section05.internal

/**
 * @author sskim
 */
// internal 가시성 테스트하기 - 다른파일
fun main() {

    val otheric = InternalClass()

    println(otheric.i)
    otheric.icFunc()
}