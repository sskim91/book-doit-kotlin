package chapter06.section03

/**
 * @author sskim
 */
//object 선언과 컴패니언 객체 비교하기
// 1. object 키워드를 사용한 방식
object OCustomer {
    var name = "Kildong"
    fun greeting() = println("Hello World!")
    val HOBBY = Hobby("Basketball")

    init {
        println("Init!")
    }
}

// 2. companion object를 사용한 방식
class CCustomer {
    companion object {
        const val HELLO = "hello"  // 상수 표현
        var name = "Joosol"

        @JvmField
        val HOBBY = Hobby("Football")

        @JvmStatic
        fun greeting() = println("Hello World!")
    }
}

class Hobby(val name: String)

fun main() {

    OCustomer.greeting()
    OCustomer.name = "Dooly"
    println("name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)

    CCustomer.greeting()
    println("name = ${CCustomer.name}, HELLO = ${CCustomer.HELLO}")
    println(CCustomer.HOBBY.name)
}