package chapter08.section02

/**
 * @author sskim
 */
//Any 자료형으로 지정된 배열 채우기
fun main() {
    val b = Array<Any>(10, { 0})
    b[0] = "Hello World"
    b[1] = 1.1
    println("b[0] = ${b[0]}")
    println("b[1] = ${b[1]}")
    println("b[2] = ${b[2]}")
}