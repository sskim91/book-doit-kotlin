package chapter02.section04

/**
 * @author sskim
 */
fun main() {
    //비트 논리 연산자 테스트하기
    val number1 = 12
    val number2 = 25

    println(number1 or number2)   // result = number1.or(number2) 와 동일
    println(number1 and number2)   // result = number1.and(number2) 와 동일
    println(number1 xor number2)   // result = number1.xor(number2) 와 동일
}