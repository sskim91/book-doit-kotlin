package chapter09.section03

import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.LinkedHashMap

/**
 * @author sskim
 */
//Map의 기타 자료구조 사용하기
fun main() {
    // java.util.HashMap의 사용
    val hashMap: HashMap<Int, String> = hashMapOf(1 to "Hello", 2 to "World")
    println("hashMap = $hashMap")

    // java.util.SortedMap 사용
    val sortedMap: SortedMap<Int, String> = sortedMapOf(1 to "Apple", 2 to "Banana")
    println("sortedMap = $sortedMap")

    // java.util.LinkedHashMap의 사용
    val linkedHash: LinkedHashMap<Int, String> = linkedMapOf(1 to "Computer", 2 to "Mouse")
    println("linkedHash = $linkedHash")
}