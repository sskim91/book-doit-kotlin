package chapter04.section01

/**
 * @author sskim
 */
//다양한 자료형의 인자 받기
//when문의 인자로 Any를 사용하면 다양한 자료형의 인자를 받을 수 있다.
class MyClass

fun main() {
    cases("Hello") // String
    cases(1) // Int
    cases(1234L) // Long
    cases(MyClass()) // Not a string
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("Int: $obj")
        "Hello" -> println("String: $obj")
        is Long -> println("Long: $obj")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}