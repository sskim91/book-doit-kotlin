package chapter06.section03

/**
 * @author sskim
 */
//object 표현식 사용해 보기
open class Superman() {
    fun work() = println("Taking photos")
    fun talk() = println("Talking with people.")
    open fun fly() = println("Flying in the air.")
}

fun main() {
    val pretendedMan = object : Superman() { // object 표현식으로 fly()구현의 재설계
        override fun fly() = println("I'm not a real superman. I can't fly!")
    }
    pretendedMan.work()
    pretendedMan.talk()
    pretendedMan.fly()
}