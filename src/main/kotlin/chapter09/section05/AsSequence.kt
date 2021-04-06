package chapter09.section05

/**
 * @author sskim
 */
//단순 메서드 체이닝 및 asSequence() 사용하기
fun main() {

    // 단순 메서드 체이닝을 사용할 때
    val list1 = listOf(1, 2, 3, 4, 5)
    val listDefault = list1
            .map { println("map($it) "); it * it } // (1)
            .filter { println("filter($it) "); it % 2 == 0 } // ②
    println(listDefault)
    println()

    // asSequence()의 사용
    val listSeq = list1.asSequence()
            .map { print("map($it) "); it * it }  // (2)
            .filter { println("filter($it) "); it % 2 == 0 } // ②
            .toList() // (3)
    println(listSeq)

}
