package chapter08.section01

/**
 * @author sskim
 */
//자료형을 숫자형으로 제한하기
class Calc<T : Number> { // 클래스의 형식 매개변수 제한
    fun plus(arg1: T, arg2: T): Double {
        return arg1.toDouble() + arg2.toDouble()
    }
}

fun main() {

    val calc = Calc<Int>()
    println(calc.plus(10, 20))

    val calc2 = Calc<Double>()
    val calc3 = Calc<Long>()
//     val calc4 = Calc<String>() // 제한된 자료형으로 인해 오류 발생!
    //Type argument is not within its bounds.
    //Expected: Number
    //Found: String

    println(calc2.plus(2.5, 3.5))
    println(calc3.plus(5L, 10L))
}