package chapter02.section01

import chapter02.edu.Person as User //alias 줄 수 있음

/**
 * @author sskim
 *
 */
fun main() {
    val user1 = User("sskim", 29)   //똑같은 Person 이지만 패키지에 따라 다름 이건 edu 패키지 Person
    val user2 = Person("ssakju", 29)    //이 파일안에 있는 Person 클래스

    println("user1.name = ${user1.name}")
    println("user1.age = ${user1.age}")

    println("user2.name = ${user2.name}")
    println("user2.age = ${user2.age}")
}

class Person(val name: String, val age: Int)