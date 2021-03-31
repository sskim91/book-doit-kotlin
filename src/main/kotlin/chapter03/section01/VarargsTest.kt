package chapter03.section01

/**
 * @author sskim
 */

fun main() {
    normalVarargs(1, 2, 3, 4)
    normalVarargs(4, 5, 6)
}

fun normalVarargs(vararg counts: Int) {
    for (num in counts) {
        print("$num")
    }
    print("\n")
}