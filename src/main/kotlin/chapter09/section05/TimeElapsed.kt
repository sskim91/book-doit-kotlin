package chapter09.section05

/**
 * @author sskim
 */
//asSequence() 의 시간 성능 알아보기
fun main() {
    val listBench = (1..1_000_000).toList()
    timeElapsed {
        listBench
                .map { it + 1 }
                .first { it % 100 == 0 }
    }

    timeElapsed {
        listBench
                .asSequence()
                .map { it + 1 }
                .first { it % 100 == 0 }
    }
}

fun timeElapsed(task: () -> Unit) {
    val before = System.nanoTime()
    task()
    val after = System.nanoTime()
    val speed = (after - before) / 1_000
    println("$speed ns")
}