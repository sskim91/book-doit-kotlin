package chapter10.section01

import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter
import java.sql.DriverManager.println

/**
 * @author sskim
 */
//use() 함수 사용해 보기
fun main() {

    PrintWriter(FileOutputStream("d:\\test\\output.txt")).use {
        it.println("hello")
    }

    val file = File("d:\\test\\contents.txt")
    file.bufferedReader().use {
        println(it.readText())
    }

}