package chapter04.section02

/**
 * @author sskim
 */
//조건에 따른 continue, break 사용하기
fun main() {
    breakExample()
    continueExample()
}

fun continueExample() {
     for (i in 1..5) {
        if (i == 3) continue //또는 break // for문 자체가 중단됨
        print(i)
    }
    println()
    println("continue")
}

fun breakExample() {
     for (i in 1..5) {
        if (i == 3) break //또는 break // for문 자체가 중단됨
        print(i)
    }
    println()
    println("break")
}
