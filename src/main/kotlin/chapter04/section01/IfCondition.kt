package chapter04.section01

/**
 * @author sskim
 */
//조건문의 표현식 사용해 보기
fun main() {
    val a = 12
    val b = 7

    //블록과함께사용
    val max = if (a > b) {
        println("a 선택")
        a
    }else{
        println("b 선택")
        b
    }

    println(max)
}