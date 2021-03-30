package chapter02.section03

/**
 * @author sskim
 */
fun main() {
    var str1: String? = "Hello Kotlin"
    str1 = null

    //Safe-Call 연산자 ?. 와 Elvis 연산자 ?:를 사용
    // 엘비스 연산자는 null이 아니라면 왼쪽 식 실행 null이면 오른쪽 실행
    println("str1: $str1 length: ${str1?.length ?: -1}")
}