package chapter02.section03

/**
 * @author sskim
 */
fun main() {
    val num = 256

    if (num is Int) {
        print(num)
    }else if (num !is Int) {
        print("Not a Int")
    }
}