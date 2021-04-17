package chapter11.section02.starttest

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

/**
 * @author sskim
 */
//시작 시점 늦춰 보기

suspend fun doWork1(): String {
    delay(1000)
    return "Work1"
}

suspend fun doWork2(): String {
    delay(3000)
    return "Work2"
}

fun main() = runBlocking {

    val time = measureTimeMillis {
        val one = async(start = CoroutineStart.LAZY) { doWork1() }
        val two = async(start = CoroutineStart.LAZY) { doWork2() }
        println("AWAIT: ${one.await() + "_" + two.await()}")
    }
    println("Completed in $time ms")

    launch(Dispatchers.Default) {

    }

    async(Dispatchers.Default) {

    }
}