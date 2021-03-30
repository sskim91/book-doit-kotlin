package chapter02.section03

/**
 * @author sskim
 */
fun main() {
    //컴파일러가 자동으로 형 변환을 하는 스마트캐스트(Smart cast)
    var test: Number = 12.2 //12.2에 의해 test는 Float형으로 스마트 캐스트
    println("$test")

    test = 12   //int형
    println("$test")

    test = 120L //Long
    println("$test")

    test += 12.0f   //Float형
    println("$test")
}