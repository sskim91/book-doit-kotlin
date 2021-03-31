package chapter04.section01

/**
 * @author sskim
 */
//when 문을 이용해 점수 등급 구하기
fun main() {
    print("Enter the score: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    when (score) {
        in 90.0..100.0 -> grade = 'A'   //90과 100사이..
        in 80.0..89.9 -> grade = 'B'    //80과 89사이..
        in 70.0..79.9 -> grade = 'C'    //70과 79사이..
        !in 70.0..100.0 -> grade = 'F'  // !반대이므로 70보다 작고 100보다 크면 F
    }
    println("Score: $score, Grade: $grade")
}