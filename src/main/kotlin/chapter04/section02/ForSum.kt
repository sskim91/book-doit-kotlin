package chapter04.section02

/**
 * @author sskim
 */
//1부터 10까지 더하기
fun main() {
    var sum = 0
    for (x in 1..10) {
        sum += x
    }
    println("sum = $sum")
}