package chapter10.section03

import java.io.File
import java.io.InputStream

/**
 * @author sskim
 */
//자바 읽기 코드의 단순 변환
fun main() {
    val path = "/Users/sskim/mqnic-logs/testfile.txt"

    // 1. 단순 변환
//    val file = File(path)
//    val inputStream: InputStream = file.inputStream( )
//    val inputStreamReader = InputStreamReader(inputStream)
//    val sb = StringBuilder( )
//    var line: String?
//    val br = BufferedReader(inputStreamReader)
//    try {
//        line = br.readLine( )
//        while (line != null) {
//            sb.append(line, '\n')
//            line = br.readLine( )
//        }
//        println(sb)
//    } catch (e:Exception) {
//    } finally {
//        br.close( )
//    }

    // 2. 코틀린 스타일
    val file = File(path)
    val inputStream: InputStream = file.inputStream()
    val text = inputStream.bufferedReader().use { it.readText() }
    println(text)

}