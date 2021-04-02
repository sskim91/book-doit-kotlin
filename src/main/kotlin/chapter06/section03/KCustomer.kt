package chapter06.section03

/**
 * @author sskim
 */
//컴패니언 객체를 가진 코틀린의 클래스
class KCustomer {
    companion object {
        const val LEVEL = "INTERMEDIATE"
        @JvmStatic
        fun login() = println("Login...") // 어노테이션 표기 사용
        @JvmStatic
        val score = 3
        @JvmField
        val JOB = KJob()
    }
}

class KJob {
    var title: String = "Programmer"
}