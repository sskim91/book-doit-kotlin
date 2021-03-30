package chapter02.section03

/**
 * @author sskim
 */
fun main() {
    var str1: String? = "Hello Kotlin"
    str1 = null //Null can not be a value of a non-null type String : Null을 허용안함

    //자료형에 물음표(?)를 붙이면 null을 할당할 수 있음
    println("str1 = $str1")

//    println("str1: $str1 length: ${str1.length }}") //Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
                                                    //String? 형에서는 세이프 콜(?.) 이나 non-null 단정 기호(!!.)만 허용한다.

    //세이프콜 기호(?.) 추가
//    println("str1: $str1 length: ${str1?.length }")

    //non-null 단정기호 (!!.)
//    println("str1: $str1 length: ${str1!!.length}")

    val len = if (str1 != null) str1.length else -1
    println("str1: $str1 length: $len")
}