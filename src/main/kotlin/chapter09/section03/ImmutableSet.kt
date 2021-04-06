package chapter09.section03

/**
 * @author sskim
 */
//불변형 Set의 초기화
fun main() {
    val mixedTypeSet = setOf("Hello", 5, "world", 3.14, 'c')    //자료형 혼합 초기화
    val intSet = setOf<Int>(1, 5, 5) //정수형만 초기화

    println("mixedTypeSet = $mixedTypeSet")
    println("intSet = $intSet")

}