package chapter10.section03

import java.io.File
import java.util.*

/**
 * @author sskim
 */
fun main() {
    val outString: String = "안녕하세요! Hello World!"
    val path = "/Users/sskim/mqnic-logs/testfile.txt"

    // 디렉터리의 파일 목록 확인
    val files = File("/Users/sskim/mqnic-logs").listFiles()
    println(Arrays.toString(files))


    // 1. 파일의 복사
    //File(path).copyTo(File("D:\\test\\file2.txt"))

    // 2. 파일의 내용 프린트하기
    File(path).forEachLine { println(it) }

    // 3. byte로 읽기 (쓰기는 writeBytes())
    val bytes = File(path).readBytes()
    println(Arrays.toString(bytes))

    // 4. line으로 읽기
    val lines = File(path).readLines()
    lines.forEach { println(it) }

    // 5. text로 읽기 (쓰기는 writeText())
    val text = File(path).readText()
    println(text)

}