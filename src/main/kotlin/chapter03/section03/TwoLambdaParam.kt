package chapter03.section03

/**
 * @author sskim
 */
//2개의 람다식을 매개변수로 가진 함수의 사용
fun main() {
    twoLambda({ a, b -> "First $a $b" }, { "Second $it" })
    twoLambda({ a, b -> "First $a $b" }) { "Second $it" }  // 위와 동일

}

fun twoLambda(first: (String, String) -> String, second: (String) -> String) {
    println(first("OneParam", "TwoParam"))
    println(second("OneParam"))
}

/**
 * ({첫 번째}, {두 번째})
 * ({첫 번째}) {두 번째}   생략 가능
 *
 * 세 개가 있을 때도 아래와 같이 마지막에만 생략 가능하다.
 * ({첫 번째}, {두 번째}) {세 번째}
**/