package chapter09.section03

import java.util.*

/**
 * @author sskim
 */
//TreeSet의 초기화
fun main() {
    // 자바의 java.util.TreeSet 선언
    val intsSortedSet: TreeSet<Int> = sortedSetOf(4, 1, 7, 2)
    intsSortedSet.add(6)
    intsSortedSet.remove(1)
    println("intsSortedSet = ${intsSortedSet}")
    intsSortedSet.clear()  // 모든 요소 삭제
    println("intsSortedSet = ${intsSortedSet}")
}