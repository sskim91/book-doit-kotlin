package chapter04.section01

/**
 * @author sskim
 */
//인자가 없는 when문 사용하기
//when문에 인자를 두지 않은 경우 조건이나 표현식을 직접만들 수 있기 때문에 특정 인자에 제한하지 않고 다양한 조건을 구성할 수 있다.
fun main() {

    print("Enter the score:")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    // 인수 없는 when의 사용
    when {
        score >= 90.0 -> grade = 'A' // 인자 있는 when과 다르게 조건식 구성할 수 있음
        score in 80.0..89.9 -> grade = 'B'
        score in 70.0..79.9 -> grade = 'C'
        score < 70.0 -> grade = 'F'
    }
    println("Score: $score, Grade: $grade")
}