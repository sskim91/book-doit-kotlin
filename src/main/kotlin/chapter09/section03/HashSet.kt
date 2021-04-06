package chapter09.section03

/**
 * @author sskim
 */
//HashSet의 초기화
fun main() {
    // 자바의 java.util.HashSet 선언
    val intsHashSet: HashSet<Int> = hashSetOf(6, 3, 4, 7)   //불변성 기능이 없음
    intsHashSet.add(5)  //추가
    intsHashSet.remove(6)   //삭제
    println(intsHashSet)
}