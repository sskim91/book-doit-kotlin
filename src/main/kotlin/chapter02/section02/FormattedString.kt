package chapter02.section02

/**
 * @author sskim
 */
fun main() {
    val num = 10
    val formattedString = """
        var a = 6
        var b = "Kotlin"
        println(a + $num)
    """
    println("formattedString = $formattedString")
}