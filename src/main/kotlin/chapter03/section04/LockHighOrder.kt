package chapter03.section04

import java.util.concurrent.locks.ReentrantLock

/**
 * @author sskim
 */
var sharable = 1    //보호가 필요한 공유 자원

fun main() {
    val reLock = ReentrantLock()
    lock(reLock, { criticalFunc() })
    lock(reLock) { criticalFunc() }
    lock(reLock, ::criticalFunc)

    //위 세 개 다 표현식이 모두 동일함. 이전 함수에서 배움
    println(sharable)
}

fun criticalFunc() {
    //공유 자원 접근 코드 사용
    sharable += 1
}

fun <T> lock(reLock: ReentrantLock, body: () -> T): T {
    reLock.lock()
    try {
        return body()
    } finally {
        reLock.unlock()
    }
}