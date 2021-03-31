package chapter03.section03

/**
 * @author sskim
 */

//매개변수에 람다식 함수를 이용한 고차 함수
fun main() {
    val result: Int
    result = highOrder({ x, y -> x * y }, 3, 4) //람다식을 매개변수와 인자로 사용한 함수
    println("highOrder = $result")
}

fun highOrder(sum: (Int, Int) -> Int, a:Int,  b:Int) : Int{
    return sum(a, b)
}