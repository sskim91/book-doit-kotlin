package chapter03.section05.tailrec

/**
 * @author sskim
 */
//꼬리 재귀를 사용해 팩토리얼 만들어 보기
fun main() {
    val number = 5
    println("Factorial: $number -> ${factorial(number)}")
}

tailrec fun factorial(n: Int, run: Int = 1): Long {
    return if (n == 1) run.toLong() else factorial(n - 1, run * n)
}