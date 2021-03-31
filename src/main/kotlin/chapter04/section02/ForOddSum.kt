package chapter04.section02

/**
 * @author sskim
 */
//짝수의 합과 홀수의 합 구하기
fun main() {

    var oddTotal: Int = 0
    var evenTotal: Int = 0

    for (num in 1..100 step 2) oddTotal += num
    println("Odd total: $oddTotal")

    for (num in 0..99 step 2) evenTotal += num
    println("Even total: $evenTotal")

}