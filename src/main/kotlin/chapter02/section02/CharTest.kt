package chapter02.section02

/**
 * @author sskim
 */
fun main() {
    val ch = 'c'    //char로 추론
    val ch2: Char   //선언만 한 경우 반드시 명시

    println("ch = ${ch}")   //c
    println("ch+1 = ${ch+1}")   //d

    val code:Int = 65
    val toChar = code.toChar()
    println("toChar = ${toChar}")
}