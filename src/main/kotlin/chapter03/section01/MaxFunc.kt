package chapter03.section01

/**
 * @author sskim
 */
fun main() {
    //함수의 호출 원리 살펴보기
    val num1 = 10
    val num2 = 3
    val result: Int

    result = max(num1, num2)
    println("result = $result")
}

fun max(num1: Int, num2: Int) = if (num1 > num2) num1 else num2 //함수 축약
