package chapter02.section02

/**
 * @author sskim
 */
fun main() {
    val a = 1   //Variable is never modified and can be declared immutable using 'val'   val로 바꾸자.
    val str1 = "a = $a"
    val str2 = "a = ${a + 2}"   //표현식을 문자열에 포함시키려면 중괄호를 사용하면 된다.

    println("str1 = $str1")
    println("str2 = $str2")

    val special = "\"Hello\", I have \$15"
    println("special = $special")
}