package chapter04.section02

/**
 * @author sskim
 */
//반복문을 이용해 삼각형 출력하기
fun main() {

    print("Enter the lines: ")
    val n = readLine()!!.toInt() // 콘솔로부터 입력 받는다

    for (line in 1..n) {
        for (space in 1..(n - line)) print(" ") // 공백 출력
        for (star in 1..(2 * line - 1)) print("*")// 별표 출력
        println() // 개행
    }

}