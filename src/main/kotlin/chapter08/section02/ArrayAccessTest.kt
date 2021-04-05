package chapter08.section02

import java.util.Arrays

/**
 * @author sskim
 */
//배열 선언 및 접근 연습하기
fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)

    println("Arrays.toString(arr) = ${Arrays.toString(arr)}")   //toString()은 배열의 내용을 문자열로 변환
    println("size:  ${arr.size}")
    println("sum(): ${arr.sum()}")  //sum()은 배열의 합

    //게터에 의한 접근과 대괄효 연산자 표기법
    println(arr.get(2))
    println(arr[2])

    //세터에 의한 값의 설정
    arr.set(2,7)
    arr[0] = 8
    println("size: ${arr.size} arr[0]: ${arr[0]}, arr[2]: ${arr[2]}")

    //루프를 통한 배열 요소의 접근
    for (i in 0..arr.size - 1) {
        println("arr[$i] = ${arr[i]}")
    }
}