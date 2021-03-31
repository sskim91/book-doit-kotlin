package chapter03.section03

/**
 * @author sskim
 */
//람다식의 매개변수 테스트하기
fun main() {
    //매개변수 없는 람다식
    noParam({ "Hello World" })
    noParam { "Hello World" }   //위와 동일, 소괄호 생략 가능, 인텔리제이에서 생략하라고 경고문구
}

fun noParam(out: () -> String) = println(out())
