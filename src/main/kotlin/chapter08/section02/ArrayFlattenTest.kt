package chapter08.section02

/**
 * @author sskim
 */
//2차원 배열을 평탄화하기
fun main() {
    val numbers = arrayOf(1, 2, 3)
    val strs = arrayOf("one", "two", "three")
    val simpleArray = arrayOf(numbers, strs)    //2차원 배열
    simpleArray.forEach { println(it) }

    val flattenSimpleArray = simpleArray.flatten()//단일 배열로 변환
    println(flattenSimpleArray)
}