package chapter02.section03

/**
 * @author sskim
 */
fun main() {
    var a: Any = 1  //Any형 a는 1로 초기화 될때 Int형이 된다.
    a = 20L // Int형이였던 a는 변경된 값 20L에 의해 Long형이 된다.
    println("a: $a type: ${a.javaClass}")

}