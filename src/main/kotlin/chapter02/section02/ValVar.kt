package chapter02.section02

/**
 * @author sskim
 */
fun main() {
    //val은 final 이고 var는 final 이 아님
    //val은 한번 선언하고 값을 초기화화면 더 이상 바꿀 수없음, 읽기 전용 변수
    //var는 값을 선언하고 바꿀 수 있음
    val number = 10;    // Int형으로 추론
    var language = "Korean" // String으로 추론
    val secondNumber: Int = 20  // 자료형을 Int형으로 명시적 지정
    language = "English"    //var 이므로 재할당 가능

    println("number = ${number}")
    println("language = ${language}")
    println("secondNumber = ${secondNumber}")
}
