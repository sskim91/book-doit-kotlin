package chapter05.section03

/**
 * @author sskim
 */
//덧셈 동작의 오버로딩
fun main() {
    val calc = Calc()
    println(calc.add(3, 2))
    println(calc.add(3.2, 1.3))
    println(calc.add(3, 3, 2))
    println(calc.add("Hello", "World"))
}

class Calc {
    // 다양한 매개변수로 오버로딩된 메서드들
    fun add(x: Int, y: Int): Int = x + y
    fun add(x: Double, y: Double): Double = x + y
    fun add(x: Int, y: Int, z: Int): Int = x + y + z
    fun add(x: String, y: String): String = x + y
}