package chapter03.section03

/**
 * @author sskim
 */
//람다식 이름을 사용해 호출하기
fun main() {
    val callByName = callByName(otherLambda)
    println("callByName = $callByName")
}


fun callByName(b: () -> Boolean): Boolean{  //람다식 자료형으로 선언된 매개변수
    println("callByName function")
    return b()
}

val otherLambda: () -> Boolean = {
    println("otherLambda function")
    true
}