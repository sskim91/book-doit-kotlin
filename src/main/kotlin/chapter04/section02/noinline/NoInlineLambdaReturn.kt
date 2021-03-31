package chapter04.section02.noinline

/**
 * @author sskim
 */
//라벨을 사용한 람다식의 반환
fun main() {
//    retFunc()
//    retFunc2()
    retFunc3()
}

fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) { // inline이 제거됨
    out(a, b)
}

fun retFunc() {
    println("start of retFunc")
    inlineLambda(13, 3) lit@{ a, b -> // (1) 람다식 블록의 시작 부분에 라벨을 지정함
        val result = a + b
        if(result > 10) return@lit // (2) 라벨을 사용한 블록의 끝부분으로 반환
        println("result: $result")
    } // (3) 이 부분으로 빠져나간다
    println("end of retFunc") // (4) 이 부분이 실행됨
}

//암묵적 라벨
fun retFunc2() {
    println("start of retFunc")
    inlineLambda(13, 3){ a, b -> // (1) 람다식 블록의 시작 부분에 라벨을 지정함
        val result = a + b
        if(result > 10) return@inlineLambda // (2) 라벨을 사용한 블록의 끝부분으로 반환
        println("result: $result")
    } // (3) 이 부분으로 빠져나간다
    println("end of retFunc") // (4) 이 부분이 실행됨
}

//익명 함수를 사용한 반환
fun retFunc3() {
    println("start of retFunc")
    inlineLambda(13, 3, fun(a, b){  //(1) 익명함수로 변환
        val result = a + b
        if(result > 10) return // (2) return을 만나면
        println("result: $result")
    })  //(3) 이 부분 끝
    println("end of retFunc") // (4) 이 부분이 실행됨
}