package chapter10.section03

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

/**
 * @author sskim
 */
//Files의  write() 메서드를 사용해 파일 생성하기
fun main() {

    val path = "/Users/sskim/mqnic-logs/hello.txt"
    val text = "안녕하세요! Hello World!\n"

    try {
        Files.write(Paths.get(path), text.toByteArray(), StandardOpenOption.CREATE)
    } catch (e: IOException) {
    }
}