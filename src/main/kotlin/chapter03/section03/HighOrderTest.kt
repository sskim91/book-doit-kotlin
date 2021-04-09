package chapter03.section03

/**
 * @author sskim
 */
//변수에 할당하는 람다식 함수 작성하기
fun main() {
    var result: Int
    val multi: (Int, Int) -> Int = { x: Int, y: Int -> x * y }    //일반 변수에 람다식 활용
//
//    val multi: (Int, Int) -> Int = { x: Int, y: Int -> x * y }  //전체 표현
//    val multi = { x: Int, y: Int -> x * y } //선언 자료형 생략
//    val multi: (Int, Int) -> Int = { x, y -> x * y }    //람다식 매개변수 자료형 생략

    result = multi(10, 20)   //람다식이 할당된 변수는 함수처럼 사용 가능
    println(result)
}