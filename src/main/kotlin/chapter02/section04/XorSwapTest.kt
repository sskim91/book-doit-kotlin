package chapter02.section04

/**
 * @author sskim
 */
fun main() {
    //XOR 연산자로 두 값을 스왑하기
    var number1 = 12
    var number2 = 25

    number1 = number1 xor number2
    number2 = number1 xor number2
    number1 = number1 xor number2

    println("number1 = " + number1)
    println("number2 = " + number2)
}