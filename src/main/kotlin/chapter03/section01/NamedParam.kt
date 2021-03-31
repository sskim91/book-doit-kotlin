package chapter03.section01

/**
 * @author sskim
 */
fun main() {
    namedParam(x = 200, z = 100) //x,z의 이름과함께 호출 y는 기본값
    //namedParam(x = 300)  // Error - z에 기본값도 없고 인자도 없으므로.
    namedParam(z = 150)  // Ok - x와 y는 기본값으로 지정됨
}

fun namedParam(x: Int = 100, y: Int = 200, z: Int) {
    println(x + y + z)
}