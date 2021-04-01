package chapter06.section01.customproperty

/**
 * @author sskim
 */
//임시적인 보조 프로퍼티 사용하기
class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    private var tempName: String? = null
    var name: String = _name
        get() {
            if (tempName == null) tempName = "NONAME"
            return tempName ?: throw AssertionError("Asserted by others")
        }
        set(value) {
            println("The name was changed")
            field = value.toUpperCase() // 받은 인자를 대문자로 변경해 프로퍼티에 할당
        }

    var age: Int = _age
}

fun main() {
    val user1 = User(1, "kildong", 35)
    user1.name = ""
    println("user3.name = ${user1.name}")
}