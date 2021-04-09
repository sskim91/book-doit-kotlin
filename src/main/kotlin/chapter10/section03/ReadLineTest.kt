package chapter10.section03

import java.util.*

/**
 * @author sskim
 */
//명령 행 콘솔에서 입력받기
fun main() {

    // 기본 코틀린의 readLine()
    print("Enter: ")
    val input = readLine()!!
    println("You entered: $input")

    // 자바의 Scanner를 통한 입력
    val reader = Scanner(System.`in`)
    var integer: Int = reader.nextInt()
    println("You entered: $integer")
}