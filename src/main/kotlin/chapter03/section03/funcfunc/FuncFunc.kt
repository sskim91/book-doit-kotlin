package chapter03.section03.funcfunc

/**
 * @author sskim
 */

//반환값에 일반 함수 사용해 보기
fun main() {
    println("funcFunc: ${funcFunc()}")
}

fun sum(a: Int, b: Int) = a + b

fun funcFunc() :Int{    //함수의 반환값으로 함수 사용
    return sum(2,2)
}