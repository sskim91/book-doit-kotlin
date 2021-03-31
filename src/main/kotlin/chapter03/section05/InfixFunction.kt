package chapter03.section05

/**
 * @author sskim
 */
//중위 함수를 이용해 연산자처럼 사용하기
fun main() {

    // 일반 표현법
    //val multi = 3.multiply(10)

    // 중위 표현법
    val multi = 3 multiply 10
    println("multi: $multi")
}

// Int를 확장해서 multiply를 하나 더 추가되었음
infix fun Int.multiply(x: Int): Int {
    return this * x
}