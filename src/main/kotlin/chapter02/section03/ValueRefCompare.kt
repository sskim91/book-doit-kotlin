package chapter02.section03

/**
 * @author sskim
 */
fun main() {
    val a: Int = 128
    val b = a   //기본형 값 대입한거임

    println(a === b)    //true

    val c: Int? = a //null을 허용한 변수는 참조형으로 저장된다.
    val d: Int? = a
    val e: Int? = c

    println(c == d) // == 두개는 값만 비교  true
    println(c === d)    //값의 내용은 같지만 참조 주소를 비교해 다른 객체(주소 다름) 이므로 false
    println(c === e)    //값의 내용도 같고 참조된 객체도 동일(주소 동일) 하므로 true

}