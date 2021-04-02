@file:JvmName("PKLevel")
package chapter06.section03

/**
 * @author sskim
 */
// 패키지 레벨 함수 혹은 최상위 함수라고 함
fun packageLevelFunc() {
    println("Package-Level Function")
}

fun main() {
    packageLevelFunc()
}